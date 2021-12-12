package com.hello.demo;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("请输入选项：1.计算国家奖牌数量 2.计算各国金牌最多的国家  3.退出");
        int bh = hi.nextInt();
        switch (bh){
            case 1:{
                System.out.println("请输入国家名称：");
                String name = hi.next();
                System.out.println("请输入金牌数量：");
                int mun1 = hi.nextInt();
                System.out.println("请输入银牌数量：");
                int mun2 = hi.nextInt();
                System.out.println("请输入铜牌数量：");
                int mun3 = hi.nextInt();
                System.out.println("国家\t金牌\t银牌\t铜牌\t总数");
                System.out.println(name+"\t"+mun1+"\t"+mun2+"\t"+mun3+"\t"+(mun1+mun2+mun3));
                break;
            }
            case 2:{
                System.out.println("请输入国家1：");
                String nameOne = hi.next();
                System.out.println("请输入国家1的金牌数量：");
                int munOne = hi.nextInt();

                System.out.println("请输入国家2");
                String nameTwo = hi.next();
                System.out.println("请输入国家2的金牌数量：");
                int munTwo = hi.nextInt();

                System.out.println("请输入国家3：");
                String nameThere = hi.next();
                System.out.println("请输入国家3的金牌数量：");
                int munThere = hi.nextInt();

                if (munOne>munTwo&munOne>munThere){
                    System.out.println(nameOne+"最多");
                }
                else if (munTwo>munOne&munTwo>munThere){
                    System.out.println(nameTwo+"最多");
                }
                else{
                    System.out.println(nameThere+"最多");
                }
                break;
            }
            case 3:{
                System.out.println("谢谢使用，再见");
                break;
            }
            default:
                System.out.println("输入的选项不存在，请重新输入！");
        }
    }
}
