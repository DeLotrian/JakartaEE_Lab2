package com.example.lab2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EditCategoriesServlet", value = "/edit-categories")
public class EditCategoriesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (!"admin".equals(session.getAttribute("username"))) {
            response.sendRedirect("LogIn.jsp");
        }
        else {
            response.setCharacterEncoding("UTF-8");
            PrintWriter out =  response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lab2</title>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Редагування категорій</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
