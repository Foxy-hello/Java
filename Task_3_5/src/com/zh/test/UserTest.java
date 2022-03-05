package com.zh.test;

import com.zh.bean.Admin;
import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

import java.util.List;

public class UserTest {
    public static void main(String[] args) {

        UserDaoImp dao = new UserDaoImp();
        Admin admin = dao.login(new Admin(0,"root","root"));
        System.out.println(admin);

    }
}
