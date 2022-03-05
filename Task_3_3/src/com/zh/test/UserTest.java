package com.zh.test;

import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

public class UserTest {
    public static void main(String[] args) {
        UserDaoImp us = new UserDaoImp();
        int in = us.insert(new User(0, "张三", "男", 16, "9654324@163.com", "17545248954", "北京"));
        System.out.println(in);
    }
}
