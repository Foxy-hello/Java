package com.zh.test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.zh.bean.Person;
import com.zh.dao.PersonDaoImp;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        PersonDaoImp dao = new PersonDaoImp();
        List<Person> list = dao.findAll();
        for (Person person : list) {
            System.out.println(person);
        }
//        System.out.println();
//        int in = dao.insert(new Person(0, "lisi", 0, "152451254785", "成都", "541257854125412"));
//        System.out.println(in);
//        System.out.println();
        int del = dao.del(7);
        System.out.println(del);

    }
}
