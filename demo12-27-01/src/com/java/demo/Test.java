package com.java.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        while (true){
            System.out.println("********************************************************");
            System.out.println("1.查看全部组信息 2.添加组 3.修改组名 4.模糊查找 5.删除组 6.退出");
            System.out.println("********************************************************");
            System.out.print("请选择：");
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    manage.Check();
                    break;
                }
                case 2:{
                    manage.addShow();
                    break;
                }
                case 3:{
                    manage.Revise();
                    break;
                }
                case 4:{
                    manage.FuzzyQuery();
                    break;
                }
                case 5:{
                    manage.Delete();
                    break;
                }
                case 6:{
                    manage.exit();
                    break;
                }
                default:{
                    System.out.println("您输入的编号不正确，请重新输入！");
                }
            }
        }
    }
}
