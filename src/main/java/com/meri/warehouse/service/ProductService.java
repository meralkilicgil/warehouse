package com.meri.warehouse.service;

import com.meri.warehouse.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);

    void deleteById(int id);

    void updateProduct(int id, Product product);
}
