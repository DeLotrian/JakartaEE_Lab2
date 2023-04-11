package com.example.lab2;

import com.example.lab2.data.repository.CategoryRepositoryImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebAppServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        try {
            sce.getServletContext().setAttribute("categoriesRepository", new CategoryRepositoryImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
