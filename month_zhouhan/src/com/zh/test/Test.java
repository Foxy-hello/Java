package com.zh.test;

import com.zh.bean.Cuisine;
import com.zh.bean.Hotel;
import com.zh.dao.AllDaoImp;

public class Test {
    public static void main(String[] args) {
        AllDaoImp dao = new AllDaoImp();
        int i = dao.upState(9, 1);
        System.out.println(i);


    }
}
