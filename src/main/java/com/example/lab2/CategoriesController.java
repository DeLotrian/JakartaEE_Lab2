package com.example.lab2;

import com.example.lab2.data.repository.CategoryRepository;
import com.example.lab2.data.repository.CategoryRepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "categoriesController", value = "/view-categories")
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
