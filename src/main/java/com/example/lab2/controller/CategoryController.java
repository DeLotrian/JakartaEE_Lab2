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
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "categoryController", value = "/categories/category")
public class CategoryController extends HttpServlet {
    private CategoryRepository categoryRepository;

    @Override
    public void init() throws ServletException {
        super.init();
        categoryRepository = new CategoryRepositoryImpl();
        //(CategoryRepository) this.getServletContext().getAttribute("categoriesRepository");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String name = request.getParameter("name");
        try {
            Optional<Category> category = categoryRepository.findByName(name);
            if (category.isPresent()) {
                request.setAttribute("category", category.get());
                request.setAttribute("products", category.get().allProducts());
                request.getRequestDispatcher("../WEB-INF/jsp/category.jsp").forward(request, resp);
            } else {
                Logger.getGlobal().log(Level.FINE, "Not found, redirecting");
                request.getRequestDispatcher("../WEB-INF/jsp/not_found.jsp").forward(request, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.getGlobal().log(Level.FINE, "Something happened", e);
            request.getRequestDispatcher("../WEB-INF/jsp/error_happened.jsp").forward(request, resp);
        }
    }
}
