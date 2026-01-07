package com.foodorder.controller;

import com.foodorder.dao.OrderDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class OrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String item = request.getParameter("item");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        int price = 0;
        if (item.equals("Pizza")) price = 250;
        else if (item.equals("Burger")) price = 120;
        else if (item.equals("Pasta")) price = 180;

        int total = price * quantity;
        Date today = new Date();

       

        OrderDAO dao = new OrderDAO();
        boolean status = dao.saveOrder(name, item, quantity, total, today);

        if (status) {
        	request.setAttribute("name", name);
            request.setAttribute("item", item);
            request.setAttribute("quantity", quantity);
            System.out.println("total:" + total);
            request.setAttribute("total", String.valueOf(total));
            request.getRequestDispatcher("confirmationbill.jsp").forward(request, response);
        } else {
            response.sendRedirect("order.jsp?error=true");
        }
    }
}
