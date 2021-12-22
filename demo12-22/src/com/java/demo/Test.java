package com.java.demo;

import java.sql.Time;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //主方法实例化图书类并通过构造方法给各属性赋值（3分）
        //主方法实例化古籍图书类（实例化时声明类型是Book类型）并通过setter方法给各属性赋值
        //主方法实例化儿童图书类（实例化时声明类型是儿童图书类型）并通过构造方法给各属性赋值
        Scanner sc = new Scanner(System.in);
        Book bo = new Book();
        Manage man = new Manage();
        while (true){
            System.out.println("===========图书管理系统===========");
            System.out.println("1.添加图书 2.查看图书 3.删除图书 4.退出");
            System.out.println("================================");
            System.out.println("请选择：");
            int key = sc.nextInt();
            switch (key){
                case 1 :{
                    System.out.println("请输入您要添加的图书：1.儿童 2.古籍");
                    int mun = sc.nextInt();
                    if (mun == 1){
                        System.out.println("请输入图书的编号：");
                        String id = sc.next();
                        System.out.println("请输入图书的名称：");
                        String name = sc.next();
                        System.out.println("请输入作者：");
                        String author = sc.next();
                        System.out.println("请输入图书的类型： 1. 14禁 2. 16禁 3. 18禁");
                        String stage = sc.next();
                        //创建对象存入数据
                        //(String id, String name, String author, String stage) {
                        ChildBook child = new ChildBook(id,name,author,stage);
                        //调用方法
                        boolean flag = man.addBook(child);
                        if (flag == true){
                            System.out.println("添加成功！");
                        }else{
                            System.out.println("添加失败！");
                        }
                    }
                    if (mun == 2){
                        System.out.println("请输入图书的编号：");
                        String id = sc.next();
                        System.out.println("请输入图书的名称：");
                        String name = sc.next();
                        System.out.println("请输入作者：");
                        String author = sc.next();
                        System.out.println("请输入出版的时间：");
                        String Time = sc.next();
                        //创建对象存入数据
                        //(String id, String name, String author, String stage) {
                        OldBook old = new OldBook(id,name,author, Time);
                        //调用方法
                        boolean flag = man.addBook(old);
                        if (flag == true){
                            System.out.println("添加成功！");
                        }else{
                            System.out.println("添加失败！");
                        }
                    }

                    break;
                }
                case 2:{
                    man.showAll();
                    break;
                }
                case 3:{
                    System.out.println("请输入需要删除的图书名称：");
                    String name = sc.next();
                    //调用删除方法
                    boolean flag = man.doDel(name);
                    if (flag == true){
                        System.out.println("删除成功！");
                    }else{

                        System.out.println("删除失败！");
                    }
                    break;
                }
                case 4:{
                    //调用退出方法
                    man.exit();
                    break;
                }
                default:
                    System.out.println("您输入的编号错误吗，请重新输入！");
            }
        }
    }
}
