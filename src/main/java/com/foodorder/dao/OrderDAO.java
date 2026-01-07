package com.foodorder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import com.food.util.DBConnection;

public class OrderDAO {

	//name, item, quantity, total, today)
    public boolean saveOrder(String name, String item, int quantity,int total, Date orderDate) {

        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();
            
            java.sql.Date sqlOrderDate = new java.sql.Date (orderDate.getTime());

            String sql = "INSERT INTO orders (name,item,quantity, total, order_time) VALUES (?, ?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, item);
            ps.setInt(3, quantity);
            ps.setInt(4, total);
           
            ps.setDate(5, sqlOrderDate);

            status = ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
