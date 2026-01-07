package com.foodorder.db;

public class TestDB {

    public static void main(String[] args) {

        if (DBConnection.getConnection() != null) {
            System.out.println("DATABASE CONNECTED SUCCESSFULLY");
        } else {
            System.out.println("DATABASE CONNECTION FAILED");
        }

    }
}
