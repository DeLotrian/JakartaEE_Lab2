package com.example.lab2.data.repository;

import com.example.lab2.data.model.Category;
import com.example.lab2.data.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product save(Product product, String categoryName);
    Optional<Product> findById(long id);
    List<Product> findAll();
    Product delete(Product product);
    Product deleteById(long id);
}
