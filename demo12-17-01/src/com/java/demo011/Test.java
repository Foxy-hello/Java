package com.java.demo011;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MangerOne man = new MangerOne();
        while (true){
            System.out.println("--------单词库管理--------");
            System.out.println("1.收藏 2.显示所有已收藏的地址 3.删除单词 4.退出");
            System.out.println("---------");
            System.out.println("请选择：");
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    man.add();
                    break;
                }
                case 2:{
                    man.feedAll();
                    break;
                }
                case 3:{
                    man.doDel();
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("输入的编号错误，请重新输入");
            }
        }
    }
}
