package com.java.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StationeryShop implements StockAndSell{
    //文具店类：
    //实现StockAndSell接口，重写sell( )和stock( )
    //提供数组，存放多个文具对象
    //提供展示方法，显示所有文具信息
    //提供判断某个文具是否存在的方法
    //参数是文具名称，找到返回下标，未找到返回-1
    Scanner sc = new Scanner(System.in);    //输入选项
    Stationery[]arr = new Stationery[10];   //定义数组，存放多个文具选项
    int count = 0;                          //计数器，从0开始
    @Override
    public void sell() {    //出售方法
        System.out.println("请输入要出售的文具：");
        String name = sc.next();
        //调用重名方法
        int index = this.feedName(name);
        if (index == -1){
            System.out.println("文具名称输入错误！");
        }else{
            System.out.println("请输入出售的数量：");
            int mun = sc.nextInt();
            if (mun > arr[index].getNumber()){
                System.out.println("商品数量不足！");
            }else{
                int number = arr[index].getNumber();    //原来的数量
                arr[index].setNumber(number-mun);
            }
        }
    }

    @Override
    public void stock() {   //进货方法
        System.out.println("请选择要进货的种类(1.笔\t2.笔记本)：");
        int type = sc.nextInt();
        if (type == 1){
            System.out.println("请输入名称：");
            String name = sc.next();
            //调用重名方法
            int index = this.feedName(name);
            if (index == -1){       //可以添加
                System.out.println("请输入进货数量：");
                int mun = sc.nextInt();
                System.out.println("请输入进货价格：");
                double price = sc.nextDouble();
                System.out.println("请输入颜色：");
                String color = sc.next();
                //Pen(String name, double price, int number, String color)
                Pen pen = new Pen(name,price, mun,color);
                arr[count++] = pen;
            }else{
                System.out.println("请输入进货数量：");
                int mun = sc.nextInt();
                int num1 = arr[index].getNumber();
                arr[index].setNumber(num1+mun);
            }
        }
        if (type == 2){
            System.out.println("请输入名称：");
            String name = sc.next();
            //调用重名方法
            int index = this.feedName(name);
            if (index == -1){       //可以添加
                System.out.println("请输入进货数量：");
                int mun = sc.nextInt();
                System.out.println("请输入进货价格：");
                double price = sc.nextDouble();
                System.out.println("请输入页数：");
                int page = sc.nextInt();
                //NoteBook(String name, double price, int number, int page)
                NoteBook note = new NoteBook(name,price,mun,page);
                arr[count++] = note;
            }else{
                System.out.println("请输入进货数量：");
                int mun = sc.nextInt();
                int num1 = arr[index].getNumber();
                arr[index].setNumber(num1+mun);
            }
        }
    }

    public void addShow(){      //展示方法
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                arr[i].show();
            }
        }
    }
    public void exit(){
        System.out.println("谢谢使用，再见");
        Date date = new Date();     //格林威治时间
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //格式转换
        String format = sim.format(date);
        System.out.println(format);
        System.exit(0);
    }

    //判断重名方法
    public int feedName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
