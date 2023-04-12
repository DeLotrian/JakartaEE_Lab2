package com.example.lab2.data.repository;

import com.example.lab2.data.DataSource;
import com.example.lab2.data.model.Category;
import com.example.lab2.utils.Constants;

import java.util.*;
import java.util.stream.Collectors;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public Optional<Category> findById(long id) {
        return findAll().stream().filter(category -> Objects.equals(category.getId(), id)).findFirst();
    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>(DataSource.categories);
        for (Category category : DataSource.categories) {
            categories.addAll(category.allCategories());
        }
        return categories;
    }

    @Override
    public List<Category> findTopLevelCategories() {
        return DataSource.categories;
    }

    @Override
    public Optional<Category> findByName(String name) {
        return findAll().stream().filter(category -> category.getName().equals(name)).findFirst();
    }

    @Override
    public Category save(Category category) {
        DataSource.categories.add(category);
        return category;
    }

    @Override
    public Category delete(Category category) {
        DataSource.categories.remove(category);
        return category;
    }

    @Override
    public Category deleteById(long id) {
        Optional<Category> category = findById(id);
        return category.orElse(null);
    }
}
