package com.java.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StationeryShop stat = new StationeryShop();
        //提供菜单
        //调用文具店类相关方法
        //进货功能：
        //如果文具名称已经存在，修改对应文具的数量
        //如果文具名称不存在，增加新的文具
        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.进货 2.售出 3.展示所有文具 4.退出");
            System.out.println("---------------------------------");
            System.out.print("请选择：");
            int key = sc.nextInt();
            switch (key){
                case 1 :{
                    stat.stock();
                    break;
                }
                case 2:{
                    stat.sell();
                    break;
                }
                case 3:{
                    stat.exhibit();
                    break;
                }
                case 4:{
                    stat.exit();
                    break;
                }
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }
}
