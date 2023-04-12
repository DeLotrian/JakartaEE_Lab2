package com.example.lab2.controller;

import com.example.lab2.data.model.Category;
import com.example.lab2.data.model.Product;
import com.example.lab2.data.repository.CategoryRepository;
import com.example.lab2.data.repository.CategoryRepositoryImpl;
import com.example.lab2.data.repository.ProductRepository;
import com.example.lab2.data.repository.ProductRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@WebServlet(name = "categoriesController", value = "/categories")
public class CategoriesController extends HttpServlet {

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;

    @Override
    public void init() throws ServletException {
        super.init();
        categoryRepository = new CategoryRepositoryImpl();
                //(CategoryRepository) this.getServletContext().getAttribute("categoriesRepository");
        productRepository = new ProductRepositoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setAttribute("categories", categoryRepository.findTopLevelCategories());
        List<Product> products = productRepository.findAll();
        Collections.shuffle(products);
        request.setAttribute("products", products);
        request.getRequestDispatcher("WEB-INF/jsp/categories.jsp").forward(request, resp);
    }
}
