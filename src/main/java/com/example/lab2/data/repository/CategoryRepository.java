package com.example.lab2.data.repository;

import com.example.lab2.data.model.Category;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CategoryRepository {
    Optional<Category> findById(long id);
    List<Category> findAll();

    List<Category> findTopLevelCategories();

    List<Category> findByName(String name);
    Category save(Category category);
    Category delete(Category category);
    Category deleteById(long id);
}
