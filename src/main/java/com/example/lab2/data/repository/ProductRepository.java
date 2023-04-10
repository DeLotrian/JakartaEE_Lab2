package com.example.lab2.data.repository;

import com.example.lab2.data.model.Product;

public interface ProductRepository {
    Product save(Product product);
    Product findById(Product product);
    Product findAll();
    Product delete(Product product);
    Product deleteById(long id);
}
