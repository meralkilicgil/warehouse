package com.meri.warehouse.service;

import com.meri.warehouse.entity.Warehouse;

import java.util.List;

public interface WarehouseService {

    List<Warehouse> findAll();

    Warehouse findById(int id);

    void save(Warehouse warehouse);

    void deleteById(int id);

    void updateWarehouse(int id, Warehouse warehouse);
}
