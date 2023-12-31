package com.meri.warehouse.controller;

import com.meri.warehouse.entity.Warehouse;
import com.meri.warehouse.service.WarehouseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    private WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping("/getAllWarehouses")
    public List<Warehouse> listAllWarehouses(){
        List<Warehouse> warehouseList = warehouseService.findAll();
        System.out.println(warehouseList);
        return warehouseList;
    }

    @PostMapping("/addNewWarehouse")
    public String addNewWarehouse(@RequestBody Warehouse warehouse){
        warehouseService.save(warehouse);
        return "saved!";
    }

    @PutMapping("/updateWarehouse/{id}")
    public String updateWarehouse(@PathVariable(name="id") String id, @RequestBody Warehouse warehouse){
        warehouseService.updateWarehouse(Integer.parseInt(id), warehouse);
        return "updated!";
    }

    @DeleteMapping("/deleteWarehouse/{id}")
    public String deleteWarehouse(@PathVariable(name = "id")String id){
        warehouseService.deleteById(Integer.parseInt(id));
        return "deleted!";
    }
}
