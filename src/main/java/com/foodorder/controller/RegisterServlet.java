package com.foodorder.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.foodorder.dao.UserDAO;
import com.foodorder.db.DBConnection;
import com.foodorder.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User u = new User(name, email, password);
        UserDAO dao = new UserDAO();

 
        if (dao.register(u)) {
            resp.sendRedirect("login.jsp");
        } else {
            resp.sendRedirect("register.jsp?error=1");
        }
    }
}
