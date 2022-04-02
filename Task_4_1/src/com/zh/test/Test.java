package com.zh.test;

import com.zh.bean.Doctor;
import com.zh.bean.Game;
import com.zh.dao.AllDaoImp;

public class Test {
    public static void main(String[] args) {
        AllDaoImp dao = new AllDaoImp();
        for (Game game : dao.findGame()) {
            System.out.println(game);
        }


    }
}
