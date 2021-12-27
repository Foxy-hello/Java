package com.java.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Manage implements Operation{
    //  编写管理类，实现接口，声明数组，遍历和操作数组，
    //  实现查看,全部组,信息、添加组、修改组名、模糊查询、删除组等功能
    Scanner sc = new Scanner(System.in);
    Group[]arr = new Group[100];
    int countOne = 0;
    int countTwo = 0;
    int count = 0;
    @Override
    public void Check() {   //查看
        if (countOne == 0 && countTwo == 0){
            System.out.println("当前共有"+countOne+"个群组，"+countTwo+"临时组");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null){
                    arr[i].show();
                }
            }
            System.out.println("当前共有"+countOne+"个群组，"+countTwo+"临时组");
        }
    }

    @Override
    public void addShow() {  //添加
        System.out.println("请输入要创建的类型(1.临时组  2.群组)：");
        int type = sc.nextInt();
        if (type == 1){
            System.out.println("请输入要创建的临时组/群组名：");
            String name = sc.next();
            int index = this.feedName(name);
            if (index == -1){
                System.out.println("请输入人数：");
                int mun = sc.nextInt();
                Date time = new Date();
                SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String format = sim.format(time);
                Date time1 = new Date();
                SimpleDateFormat sim1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String format1 = sim1.format(time1);
                //TemporaryGroup(String name, int number, Date time, Date lastTime)
                TemporaryGroup tem = new TemporaryGroup(name,mun,format,format1);
                arr[count++] = tem;
                countOne++;
                System.out.println("添加成功！");
            }else{
                System.out.println("分组或者群组已经存在，无法创建！");
            }
        }
        if (type == 2){
            System.out.println("请输入要创建的临时组/群组名：");
            String name = sc.next();
            int index = this.feedName(name);
            if (index == -1){
                System.out.println("请输入人数：");
                int mun = sc.nextInt();
                System.out.println("请输入群公告：");
                String Attributes = sc.next();
                if (Attributes.length() > 10 ){
                    String sub = Attributes.substring(0, 10);
                    Attributes = sub += "......";
                }
                Date time1 = new Date();
                SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String format = sim.format(time1);
                MyGroup my = new MyGroup(name,mun,format,Attributes);
                arr[count] = my;
                countTwo++;
            }

        }
    }

    @Override
    public void Revise() {  //修改组名
        System.out.println("请输入需要修改的组名:");
        String name = sc.next();
        int index = this.feedName(name);
        if (index == -1){   //可以修改
            System.out.println("没有这个组名");
        }else{
            System.out.println("请输入新的组名：");
            String name1 = sc.next();
            arr[index].setName(name1);
            System.out.println("修改成功！");
        }

    }

    @Override
    public void FuzzyQuery() {  //模糊查询
        System.out.println("请输入需要模糊查询的组名：");
        String name = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null && arr[i].getName().contains(name)){
                arr[i].show();
            }
        }
        System.out.println("修改成功！");
    }

    @Override
    public void Delete() {  //删除
        System.out.println("请输入需要删除的组名：");
        String name = sc.next();
        int index = this.feedName(name);
        if (index == -1){
            System.out.println("组名不存在，请重新输入！");
        }else{
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            System.out.println("删除成功！");
        }
    }
    public void exit(){     // 退出
        System.out.println("谢谢使用，再见");
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
