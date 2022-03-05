package com.zh.test;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

public class Test {
    public static void main(String[] args) {
        AdminDaoImp imp = new AdminDaoImp();
        int i = imp.insert(new Admin(0, "李四", "45612"));
        System.out.println(i);
    }
}
