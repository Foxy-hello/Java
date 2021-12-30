package com.java.demo;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class Manger implements VoidTotal,Operation{
    //编写管理类，实现统计接口和操作接口，重写并实现方法
    //提供存储资产的数组，类型正确、大小合理
    Scanner sc = new Scanner(System.in);
    Asset[]arr = new Asset[100];
    int count = 0;
    //提供初始化方法，数组赋值至少3个元素
    public void initial(){
        if (count == 0){
            //Fixed(String name, double price, String buyTime, String department) 固定
            //Intangible(String name, String instruction, String type)            无形
            Asset fix = new Fixed("房产",1800000,"2020-09-12","销售部");
            Asset fix2 = new Fixed("商铺",2800000,"2015-09-12","招商部");
            Asset inTang = new Intangible("腾讯干股","腾讯系列股票","股票");
            Asset inTang2 = new Intangible("华为干股","华为系列股票","干股");
            //存进数组
            arr[count++] = fix;
            arr[count++] = fix2;
            arr[count++] = inTang;
            arr[count++] = inTang2;
            System.out.println("初始化成功！");
        }else{
            System.out.println("已完成初始化，无需重复！");
         }
        }

    @Override
    public boolean add(Asset asset) {       //增加资产，名称不能重复，成功true，失败false
        if (count ==0){
            System.out.println("请先初始化");
        }else{
            //调用重名方法
            int index = this.feedSameName(asset.getName());
            if (index == -1){   //可以添加
                arr[count++] = asset;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean update(String name) {    //根据资产名称修改资产信息
        if (count == 0){
            System.out.println("请先初始化！");
        }else{
            //判断重名方法
            int index = this.feedSameName(name);
            if (index == -1){
                System.out.println("该名称不存在！");
            }else{
                System.out.println("请输入更改的名称：");
                String newName = sc.next();
                arr[index].setName(newName);
                return true;
            }
        }
        return false;
    }

    @Override
    public void showAll() {                 //显示所有的资产信息
        if (count == 0){
            System.out.println("请先完成初始化！");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null && arr[i] instanceof Fixed){
                    arr[i].show();
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null && arr[i] instanceof Intangible){
                    arr[i].show();
                }
            }
        }
    }

    @Override
    public void total() {                   //统计资产信息，输出固定资产的数量和无形资产的数量
        if (count == 0){
            System.out.println("请先完成初始化！");
        }else{
            int countOne = 0;
            int countTwo = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null && arr[i] instanceof Fixed ){
                    countOne++;
                }
                if (arr[i] != null && arr[i] instanceof Intangible){
                    countTwo++;
                }
            }
            System.out.println("固定资产有"+countOne+"个"+"无形资产有"+countTwo+"个");
        }
    }
    //判断重名方法
    public int feedSameName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}
