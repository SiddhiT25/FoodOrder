package com.food.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            System.out.println("Loading MySQL Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/foodorderdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String user = "siddhi";
            String pass = "Siddhi2025";

            System.out.println("Connecting to database...");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("DB CONNECTED SUCCESSFULLY ✔");
        } catch (Exception e) {
            System.out.println("DB CONNECTION FAILED ❌");
            e.printStackTrace();
        }
        return con;
    }
}


