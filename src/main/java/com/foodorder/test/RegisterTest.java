package com.foodorder.test;

import com.foodorder.dao.UserDAO;
import com.foodorder.model.User;

public class RegisterTest {
    public static void main(String[] args) {

        User u = new User("Rahul", "rahul@gmail.com", "1234");
        UserDAO dao = new UserDAO();

        if (dao.register(u)) {
            System.out.println("USER REGISTERED SUCCESSFULLY");
        } else {
            System.out.println("REGISTRATION FAILED");
        }
    }
}
