package com.example.lab2.controller;

import com.example.lab2.data.model.Category;
import com.example.lab2.data.repository.CategoryRepository;
import com.example.lab2.data.repository.CategoryRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Logger;

@WebServlet(name = "categoriesController", value = "/categories")
public class CategoriesController extends HttpServlet {

    private CategoryRepository categoryRepository;

    @Override
    public void init() throws ServletException {
        super.init();
        categoryRepository = new CategoryRepositoryImpl();
                //(CategoryRepository) this.getServletContext().getAttribute("categoriesRepository");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setAttribute("categories", categoryRepository.findTopLevelCategories());
        request.getRequestDispatcher("WEB-INF/jsp/categories.jsp").forward(request, resp);
    }
}
