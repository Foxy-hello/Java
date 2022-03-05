package com.java.test;

import com.java.bean.User;
import com.java.dao.UserImp;

public class UserTest {
    public static void main(String[] args) {
        UserImp us = new UserImp();
        User login = us.login("root", "root");
        System.out.println(login);
    }
}
