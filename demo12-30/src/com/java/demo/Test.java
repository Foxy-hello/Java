package com.java.demo;

import java.util.Scanner;

/**
 * 提供菜单项，包含初始化、统计各类资产个数、增加资产、修改资产、显示所有资产、退出等（2分）
 * ② 菜单能循环调用（2分）
 * ③ 选择菜单項后，能正确调用管理类中的方法进行测试（10分，每个分支2分）
 * ④ 选择“退出”时，能正确退出（1分）
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manger man = new Manger();
        while (true){
            System.out.println("1.初始化 2.统计各类资产个数 3.增加资产 4.修改资产 5.显示所有资产 6.退出");
            System.out.print("请选择:");
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    man.initial();
                    break;
                }
                case 2:{
                    man.total();
                    break;
                }
                case 3:{
                    System.out.println("请输入资产的类型(1.固定资产  2.无形资产)：");
                    int key01 = sc.nextInt();
                    if (key01 == 1){
                        System.out.println("请输入资产的名称：");
                        String name = sc.next();
                        System.out.println("请输入资产的价格：");
                        double price = sc.nextDouble();
                        System.out.println("请输入购置的日期：");
                        String time = sc.next();
                        System.out.println("请输入购置的部门:");
                        String type = sc.next();
                        Asset fixed = new Fixed(name,price,time,type);
                        //调用方法
                        boolean flag = man.add(fixed);
                        if (flag == true){
                            System.out.println("添加成功！");
                        }else{
                            System.out.println("添加失败！");
                        }
                    }else{
                        System.out.println("请输入资产的名称：");
                        String name = sc.next();
                        System.out.println("请输入资产说明：");
                        String instruction = sc.next();
                        System.out.println("请输入资产的类型");
                        String type = sc.next();
                        Asset inAn = new Intangible(name,instruction,type);
                        //调用方法
                        boolean flag = man.add(inAn);
                        if (flag == true){
                            System.out.println("添加成功！");
                        }else{
                            System.out.println("添加失败！");
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("请输入要修改的资产名称：");
                    String name = sc.next();
                    boolean flag = man.update(name);
                    if (flag == true){
                        System.out.println("修改成功!");
                    }else{
                        System.out.println("修改失败");
                    }
                    break;
                }
                case 5:{
                    man.showAll();
                    break;
                }
                case 6:{
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
