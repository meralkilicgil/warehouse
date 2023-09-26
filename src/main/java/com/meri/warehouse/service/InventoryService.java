package com.meri.warehouse.service;


import com.meri.warehouse.entity.Inventory;

import java.util.List;

public interface InventoryService {
    List<Inventory> findAll();

    Inventory findById(int id);

    void save(Inventory inventory);

    void deleteById(int id);

    void updateInventory(int id, Inventory inventory);
}
