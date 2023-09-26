package com.meri.warehouse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "warehouse")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "warehouse_name")
    private String warehouseName;

    @OneToMany(mappedBy = "warehouse") //warehouse is the variable name in Inventory class to map this variable
    private List<Inventory> inventoryList;

    public Warehouse(int id, String warehouseName) {
        this.id = id;
        this.warehouseName = warehouseName;
    }

    public Warehouse() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
}
