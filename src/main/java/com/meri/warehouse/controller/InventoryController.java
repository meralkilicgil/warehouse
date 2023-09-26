package com.meri.warehouse.controller;

import com.meri.warehouse.entity.Inventory;
import com.meri.warehouse.entity.Warehouse;
import com.meri.warehouse.service.InventoryService;
import com.meri.warehouse.service.WarehouseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/getAllInventories")
    public List<Inventory> listAllWarehouses(){
        List<Inventory> inventoryList = inventoryService.findAll();
        System.out.println(inventoryList);
        return inventoryList;
    }

    @PostMapping("/addNewInventory")
    public String addNewWarehouse(@RequestBody Inventory inventory){
        inventoryService.save(inventory);
        return "saved!";
    }

    @PutMapping("/updateInventory/{id}")
    public String updateInventory(@PathVariable(name="id") String id, @RequestBody Inventory inventory){
        inventoryService.updateInventory(Integer.parseInt(id), inventory);
        return "updated!";
    }

    @DeleteMapping("/deleteInventory/{id}")
    public String deleteInventory(@PathVariable(name = "id")String id){
        inventoryService.deleteById(Integer.parseInt(id));
        return "deleted!";
    }
}
