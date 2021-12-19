package com.java.demo;

import java.util.Scanner;

public class People {
    //提供姓名属性
    String name;
    //创建构造方法，正在开机
    public People(String name){
        Computer c = new Computer();
        this.name = name;
        System.out.println(name+"正在开机");
    }

    Scanner sc = new Scanner(System.in);
    Computer com = new Computer();
    //人类中，正确定义打开电脑方法，参数正确，正确输出和调用方法
    public void openComputer(Computer com){

        com.open();
    }

    //正确定义登录电脑方法，参数正确，提供控制台输入登录名和密码，并实现登录功能
    public void longinComputer(Computer com){
        //登录功能，密码三次验证
        int count = 3;
        //死循环实现功能可重复调用
        while (true){
            System.out.println("请输入登录名：");
            String inName = sc.next();
            System.out.println("请输入登录密码：");
            int inPassword = sc.nextInt();
            //调用登录方法
            boolean flag = com.login(inName, inPassword);
            if (flag == true){
                System.out.println("欢迎"+inName);
                this.menu();  //调用菜单方法！！！！！！
                break;
            }else{
                count--;
                if (count == 0){
                    System.out.println("多次登录失败，电脑被锁定");
                    break;
                }else{
                    System.out.println("密码错误，请重新输入，您还有"+count+"次机会");
                }
            }
        }
    }
    //① 正确提供菜单，能循环使用（3分）
    //② 能根据菜单选择并执行不同的功能（5分）
    //③ 正确调用展示已安装软件方法，效果正确（3分）
    //④ 正确调用安装软件方法，效果正确（3分）
    //⑤ 正确调用卸载软件方法，效果正确（3分）
    public void menu(){
        while (true){
            System.out.println("\n*************菜单***************");
            System.out.println("1.已安装的软件 2.安装软件 3.卸载软件 4.退出");
            System.out.println("*************************");
            System.out.println("请选择：");
            int key = sc.nextInt();

            switch (key){
                case 1:{
                    com.findAll();
                    break;
                }
                case 2:{
                    System.out.println("请输入需要安装的软件：");
                    String name = sc.next();
                    boolean flag = com.addSoft(name);
                    if (flag == true){
                        System.out.println("安装成功");
                    }else{
                        System.out.println("安装失败");
                    }
                    break;
                }
                case 3:{
                    System.out.println("请输入您要卸载的软件：");
                    String del = sc.next();
                    //调用卸载方法
                    boolean flag = com.doDel(del);
                    if (flag == true){
                        System.out.println("卸载成功");
                    }else{
                        System.out.println("卸载失败！");
                    }
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("您输入有误，请重新输入！");
            }
        }
    }

}
