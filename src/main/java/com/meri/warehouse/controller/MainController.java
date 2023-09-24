package com.meri.warehouse.controller;

import com.meri.warehouse.entity.Product;
import com.meri.warehouse.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private ProductService productService;

    public MainController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAllProducts")
    public List<Product> listAllProducts(){
        List<Product> productList = productService.findAll();
        System.out.println(productList);
        return productList;
    }

    @PostMapping("/addNewProduct")
    public String addNewProduct(@RequestBody Product product){
        productService.save(product);
        return "saved!";
    }

    @PutMapping("/updateProduct/id={id}")
    public String updateProduct(@PathVariable(name="id") String id, @RequestBody Product product){
        productService.updateProduct(Integer.parseInt(id), product);
        return "updated!";
    }

    @DeleteMapping("/deleteProduct/id={id}")
    public String deleteProduct(@PathVariable(name = "id")String id){
        productService.deleteById(Integer.parseInt(id));
        return "deleted!";
    }
}
