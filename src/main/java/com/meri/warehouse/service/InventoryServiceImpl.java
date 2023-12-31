package com.meri.warehouse.service;

import com.meri.warehouse.dao.InventoryRepository;
import com.meri.warehouse.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> findAll() {
        return inventoryRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Inventory findById(int id) {
        Optional<Inventory> inventoryOptional = inventoryRepository.findById(id);
        return inventoryOptional.orElse(null);
    }

    @Override
    public void save(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    @Override
    public void deleteById(int id) {
        inventoryRepository.deleteById(id);
    }

    @Override
    public void updateInventory(int id, Inventory inventory) {
        inventory.setId(id);
        inventoryRepository.save(inventory);
    }
}
