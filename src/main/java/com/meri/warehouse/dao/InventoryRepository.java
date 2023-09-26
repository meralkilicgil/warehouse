package com.meri.warehouse.dao;

import com.meri.warehouse.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    public List<Inventory> findAllByOrderByIdAsc();
}
