package com.example.lab2.data.repository;

import com.example.lab2.data.DataSource;
import com.example.lab2.data.model.Category;
import com.example.lab2.data.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public Product save(Product product, String categoryName) {
        Optional<Category> categoryToSave = DataSource.categories.stream().filter(cat -> cat.getName().equals(categoryName)).findFirst();
        categoryToSave.ifPresent(category -> category.getProducts().add(product));
        return product;
    }

    @Override
    public Optional<Product> findById(long id) {
        return findAll().stream().filter(product -> product.getId() == id).findFirst();
    }

    @Override
    public List<Product> findAll() {
        List<Product> allProducts = new ArrayList<>();
        DataSource.categories.forEach(category -> allProducts.addAll(category.allProducts()));

        return allProducts;
    }

    @Override
    public Product delete(Product product) {
        for (Category category : DataSource.categories) {
            category.deleteProduct(product);
        }
        return null;
    }

    @Override
    public Product deleteById(long id) {
        Optional<Product> product = findById(id);
        product.ifPresent(this::delete);
        return product.orElse(null);
    }
}
