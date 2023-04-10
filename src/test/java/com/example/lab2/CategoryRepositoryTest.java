package com.example.lab2;

import com.example.lab2.data.repository.CategoryRepository;
import com.example.lab2.data.repository.CategoryRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryRepositoryTest {

    @Test
    public void testFindsElements() {
        CategoryRepository categoryRepository = new CategoryRepositoryImpl();
        Assertions.assertFalse(categoryRepository.findAll().iterator().hasNext());
    }
}
