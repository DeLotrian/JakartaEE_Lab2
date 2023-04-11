package com.example.lab2.data.model;

import com.example.lab2.utils.Constants;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
//@Table(name = Constants.CATEGORIES_TABLE)
public class Category {

    //@Id
    private Long id = System.currentTimeMillis();

    private String name;

    //@JsonIgnore
    //@ManyToOne(fetch = FetchType.LAZY)
    private Category parentCategory;

    //@OneToMany(mappedBy = "parentCategory")
    private Set<Category> subCategories = new HashSet<>();

    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> products = new HashSet<>();

    public Category() {}

    public Category(String name, Set<Category> subCategories, Set<Product> products) {
        this.name = name;
        if (subCategories != null) this.subCategories = subCategories;
        if (products != null) this.products = products;
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@ManyToOne(fetch = FetchType.LAZY)
    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Id
    public Long getId() {
        return id;
    }

    //@OneToMany(mappedBy = "parentCategory")
    public Set<Category> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(Set<Category> subCategories) {
        this.subCategories = subCategories;
    }

    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Product> allProducts() {
        Set<Product> products = new HashSet<>(getProducts());
        if (!subCategories.isEmpty()) {
            for (Category category : subCategories) {
                products.addAll(category.allProducts());
            }
        }
        return products;
    }

    public Set<Category> allCategories() {
        Set<Category> categories = new HashSet<>(getSubCategories());
        if (!subCategories.isEmpty()) {
            for (Category category : subCategories) {
                categories.addAll(category.subCategories);
            }
        }
        return categories;
    }
}