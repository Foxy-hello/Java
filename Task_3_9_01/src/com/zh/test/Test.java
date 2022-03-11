package com.zh.test;

import com.zh.baan.Stu;
import com.zh.dao.AllDaoImp;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        AllDaoImp dao = new AllDaoImp();
        for (Stu e : dao.fuzzy("六", "2000-01-01", "2022-01-01", "2")) {
            System.out.println(e);
        }

    }
}
