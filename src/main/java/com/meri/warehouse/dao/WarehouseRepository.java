package com.meri.warehouse.dao;

import com.meri.warehouse.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {

    public List<Warehouse> findAllByOrderByWarehouseNameAsc();
}
