package com.example.lab2.data.repository;

import com.example.lab2.data.DataSource;
import com.example.lab2.data.model.Category;
import com.example.lab2.utils.Constants;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public Optional<Category> findById(long id) {
        return DataSource.categories.stream().filter(category -> category.getId() == id).findFirst();
    }

    @Override
    public Iterable<Category> findAll() {
        Set<Category> categories = new HashSet<>(DataSource.categories);
        for (Category category : DataSource.categories) {
            categories.addAll(category.allCategories());
        }
        return categories;
    }

    @Override
    public Iterable<Category> findTopLevelCategories() {
        return DataSource.categories;
    }

    @Override
    public Iterable<Category> findByName(String name) {
        return DataSource.categories.stream().filter(category -> category.getName().equals(name)).collect(Collectors.toList());
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
