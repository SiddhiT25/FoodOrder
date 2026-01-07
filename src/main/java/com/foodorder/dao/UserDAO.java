package com.foodorder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.foodorder.db.DBConnection;
import com.foodorder.model.User;

public class UserDAO {

    public boolean register(User u) {

        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name,email,password) VALUES(?,?,?)";

            System.out.println("connection is:" + con);
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());

            int i = ps.executeUpdate();

            if(i > 0){
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
