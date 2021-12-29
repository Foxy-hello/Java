package com.bawei.demo;

import java.util.Scanner;

//（7）编写管理类，实现统计接口和操作接口，重写并实现方法
public class Manager implements Statistics,Operate{
    //提供存储资产的数组，类型正确、大小合理
    Asset[] arr = new Asset[10];
    int count = 0;

    //创建输入对象
    Scanner sc = new Scanner(System.in);

    //初始化提供方法，数组赋值至少3个元素
    public void newShow(){
        Asset asset = new Fixed("意外险",5000,"2020-10-8","销售部");
        Asset asset2 = new Fixed("疾病险",10000,"2020-12-8","销售部");
        Asset asset3 = new Intangible("零钱通","微信里面用来存放，吃利息","货币资金");
        Asset asset4 = new Intangible("花呗","支付宝透支有限额度","货币资金");

        arr[count++] = asset;
        arr[count++] = asset2;
        arr[count++] = asset3;
        arr[count++] = asset4;
        System.out.println("初始化成功");
    }

    //重写显示所有资产信息方法
    //正确编写方法，能展示所有资产信息
    @Override
    public void showAll() {
        if (count == 0){
            System.out.println("未添加任何资产");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=null && arr[i] instanceof Fixed){
                        arr[i].show();
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=null && arr[i] instanceof Intangible){
                    arr[i].show();
                }
            }
        }
    }

    //重写增加资产方法
    /*
    正确编写增加资产方法，参数、返回值正确（2分）
    ⑥ 正确编写增加资产方法，增加方法，保证资产名称不能重复（3分）
    ⑦ 正确编写增加资产方法，保证添加正确，数据和结果正确（5分）
     */
    @Override
    public boolean add(Asset asset) {
        if (count >= arr.length){
            return false;
        }else{
            arr[count++] = asset;
            return true;
        }
    }

    //重写修改资产信息方法
    /*
    正确编写根据资产名称修改方法，参数、返回值正确（2分）
    ⑨ 正确编写根据资产名称修改方法，能判断资产类型，分支修改资产（5分）
    ⑩ 正确根据资产名称修改资产，数据和结果正确（5分）
     */
    @Override
    public boolean update(String name) {
        int index = this.findSameName(name);
        if (index == -1){ //说明不存在 无法修改
            return false;
        }else{ //说明存在 进行修改
            if (arr[index] instanceof Fixed){
                System.out.print("请输入新资产名称：");
                String newName = sc.next();
                System.out.print("请输入新资产价格：");
                double newPrice = sc.nextDouble();
                //向下转型
                Fixed fixed = (Fixed) arr[index];
                fixed.setName(newName);
                fixed.setPrice(newPrice);
            }else if (arr[index] instanceof Intangible){
                System.out.print("请输入新资产名称：");
                String newName = sc.next();
                System.out.print("请输入新资产说明：");
                String newExplain = sc.next();
                //向下转型
                Intangible intangible = (Intangible) arr[index];
                intangible.setName(newName);
                intangible.setExplain(newExplain);
            }
            return true;
        }
    }

    //重写统计资产信息方法
    //正确编写统计资产信息方法，输出固定资产的数量和无形资产的数量
    @Override
    public void total() {
        int fCount = 0;
        int iCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null){
                if (arr[i] instanceof Fixed){
                    fCount++;
                }else if (arr[i] instanceof Intangible){
                    iCount++;
                }
            }
        }
        System.out.println("固定资产数量："+fCount);
        System.out.println("无形资产数量："+iCount);
    }
    //判断重名方法
    public int findSameName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null && arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
