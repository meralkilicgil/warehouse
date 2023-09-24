package com.meri.warehouse.service;

import com.meri.warehouse.exception.WarehouseException;
import com.meri.warehouse.dao.ProductRepository;
import com.meri.warehouse.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAllByOrderByProductNameAsc();
    }

    @Override
    public Product findById(int id) {
        Optional<Product> result = productRepository.findById(id);

        Product product = null;

        if(result.isPresent()){
            product = result.get();
        }
        else {
            throw new WarehouseException("The Product cannot be found with the id: " + id);
        }
        return product;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        product.setId(id);
        save(product);
    }
}
