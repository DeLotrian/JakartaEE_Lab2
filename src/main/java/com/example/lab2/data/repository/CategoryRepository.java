package com.example.lab2.data.repository;

import com.example.lab2.data.model.Category;

import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(long id);
    Iterable<Category> findAll();
    Iterable<Category> findByName(String name);
    Category save(Category category);
    Category delete(Category category);
    Category deleteById(long id);
}
