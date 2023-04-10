package com.example.lab2.data.repository;

import com.example.lab2.data.model.Category;
import com.example.lab2.utils.Constants;

import java.util.Optional;
import java.util.stream.Collectors;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public Optional<Category> findById(long id) {
        return Constants.categories.stream().filter(category -> category.getId() == id).findFirst();
    }

    @Override
    public Iterable<Category> findAll() {
        return Constants.categories;
    }

    @Override
    public Iterable<Category> findByName(String name) {
        return Constants.categories.stream().filter(category -> category.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public Category save(Category category) {
        Constants.categories.add(category);
        return category;
    }

    @Override
    public Category delete(Category category) {
        Constants.categories.remove(category);
        return category;
    }

    @Override
    public Category deleteById(long id) {
        Optional<Category> category = findById(id);
        return category.orElse(null);
    }
}
