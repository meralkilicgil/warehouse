package com.meri.warehouse.service;

import com.meri.warehouse.dao.WarehouseRepository;
import com.meri.warehouse.entity.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public List<Warehouse> findAll() {
        return warehouseRepository.findAllByOrderByWarehouseNameAsc();
    }

    @Override
    public Warehouse findById(int id) {
        Optional<Warehouse> warehouseOptional = warehouseRepository.findById(id);
        return warehouseOptional.orElse(null);
    }

    @Override
    public void save(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }

    @Override
    public void deleteById(int id) {
        warehouseRepository.deleteById(id);
    }

    @Override
    public void updateWarehouse(int id, Warehouse warehouse) {
        warehouse.setId(id);
        warehouseRepository.save(warehouse);
    }
}
