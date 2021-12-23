package com.java.demo;


import java.util.Scanner;

public class StationeryShop implements StockAndSell {
    //实现StockAndSell接口，重写sell( )和stock( )
    //提供数组，存放多个文具对象
    //提供展示方法，显示所有文具信息
    //提供判断某个文具是否存在的方法
    //参数是文具名称，找到返回下标，未找到返回-1
    Scanner sc = new Scanner(System.in);
    //提供数组，存放多个文具对象
    Stationery []arr = new Stationery[100];
    int count = 0;
    @Override
    public void sell() {    //出售商品
        System.out.println("请输入需要出售的文具：");
        String sellName = sc.next();
        //调用重名方法
        int index02 = this.feedName(sellName);
        if (index02 == -1){     //说明不存在这个物品，给出提示
            System.out.println("仓库并没有此类物品！");
        }else{                  //存在物品，比较库存是否够
            System.out.print("请输入出售的数量：");
            int sellMun = sc.nextInt();
            //比较现有数量和库存数量
            int inStock = arr[index02].getMunBer();
            if (inStock > sellMun){     //库存数量大于等于本次销售数量，可以出售
                arr[index02].setMunBer(inStock-sellMun);
                System.out.println("出售成功！");
            }else{
                System.out.println("没有这么多的库存!");
            }
        }
    }

    @Override
    public void stock() {   //上架商品
        System.out.print("请输入要进货的种类(1. 笔\t2. 笔记本)：");
        int type = sc.nextInt();
        if (type == 1){
            System.out.print("请输入名称：");
            String name = sc.next();
            //调用重名方法进行判断
            int index = this.feedName(name);
            if (index == -1){   //说明不存在，可以添加
                System.out.print("请输入进货数量：");
                int munBer = sc.nextInt();
                System.out.print("请输入进货价格：");
                String price = sc.next();
                System.out.print("请输入颜色：");
                String color = sc.next();
                //把对象存入数组  Pen(String name, String munBer, String price, String color)
                Pen pen = new Pen(name,munBer,price,color);
                //添加数据
                arr[count++] = pen;
                System.out.println("添加成功！");
            }else{      //说明存在，修改数量！
                System.out.print("请输入进货数量：");
                int munBer = sc.nextInt();
                //添加数量，原来的数量加上本次添加的数量等于现在的数量
//          1.      int newMunBer = arr[index].getMunBer() + munBer;
                    //用 newMunBer 来接收数组原来的数量,用getMunBer来读取数组原来的值+本次添加的数量
//          1.     arr[index].setMunBer(newMunBer);//用set方法来添加新的值
                arr[index].setMunBer(munBer+arr[index].getMunBer());
            }

        }else if (type == 2){
            System.out.print("请输入名称：");
            String name = sc.next();
            //调用重名方法进行判断
            int index01 = this.feedName(name);
            if (index01 == -1){     //说明不存在该商品，可以添加
                System.out.print("请输入进货数量：");
                int munBer = sc.nextInt();
                System.out.print("请输入进货价格：");
                String price = sc.next();
                System.out.print("请输入页数：");
                String page = sc.next();
                //创建对象，使用有参构造存入数据,
                //NoteBook(String name, String munBer, String price, String page)
                NoteBook note = new NoteBook(name,munBer,price,page);
                //添加数据
                arr[count++] = note;
                System.out.println("添加成功！");
            }else{      //存在商品的话，修改商品数量
                System.out.println("请输入进货数量：");
                int munBer = sc.nextInt();
                //现在的数量=原来的数量+本次添加的数量
                int newMumBer2 = arr[index01].getMunBer() + munBer;
                arr[index01].setMunBer(newMumBer2);
            }
        }


    }


    //提供展示方法
    public void exhibit(){  //展示信息
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                arr[i].show();
            }
        }
    }

    public void exit(){     //退出信息
        System.out.println("退出成功！");
        System.exit(0);
    }

    //判断重名
    public int feedName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null && arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
