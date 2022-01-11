package com.java.demo05;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("乐乐",16,"男"));
        hs.add(new Student("郝思达",14,"男"));
        hs.add(new Student("王琳",17,"女"));
        hs.add(new Student("宁净",13,"女"));
        System.out.println("最初遍历");
        for (Student h : hs) {
            System.out.println(h);
        }
        System.out.println();
        for (Student h : hs) {
            if (h.getSex().equals("女")){
                System.out.println(h);
            }
        }
        System.out.println();
        //移除集合中名为“宁净”且年龄为13岁的学生，如果没有该学生则提示“学生不存在
        hs.removeIf(del -> del.getName().equals("宁净") && del.getAge() == 13);
        System.out.println("删除后的遍历是");
        for (Student h : hs) {
            System.out.println(h);
        }
        //按照年龄由大到小，展示数据
        Collections.max(hs, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("按照年纪大小排序遍历");
        for (Student h : hs) {
            System.out.println(h);
        }
        System.out.println("反转后的数据是");
        LinkedList<Student> list = new LinkedList<>();
        list.addAll(hs);
        Collections.reverse(list);
        for (Student student : list) {
            System.out.println(student);
        }
        Student max = Collections.max(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("年龄最大是： "+max);

    }
}
