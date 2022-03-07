package com.zh.test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

public class UserTest {
    public static void main(String[] args) {
        UserDaoImp dao = new UserDaoImp();
        User byId = dao.findById(1);
        System.out.println(byId);
    }
}
