package com.example.lab2;

import com.example.lab2.data.model.Category;
import com.example.lab2.data.repository.CategoryRepository;
import com.example.lab2.data.repository.CategoryRepositoryImpl;
import org.apache.commons.collections4.IterableUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CategoryRepositoryTest {

    @Test
    public void testFindsElements() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        Assertions.assertTrue(categoryRepository.findAll().iterator().hasNext());
    }

    @Test
    public void testIsNumberOfCategoriesCorrect() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        List<Category> categories = categoryRepository.findAll();
        Assertions.assertEquals(8, categories.size());
    }

    @Test
    public void testTopLevelCategoriesNumberIsCorrect() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        List<Category> categories = categoryRepository.findTopLevelCategories();
        Assertions.assertEquals(2, categories.size());
    }

    @Test
    public void assertFindsByName() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        Category category = categoryRepository.findByName("Sedans").orElse(null);
        Assertions.assertNotNull(category);
    }
}
