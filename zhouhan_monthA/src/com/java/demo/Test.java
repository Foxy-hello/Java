package com.java.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WorkRoom work = new WorkRoom();
        while (true){
            System.out.println("1. 显示影片信息 2.播放影片 3.添加影片 4.删除影片 5.退出");
            System.out.print("请选择：");
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    work.showAll();                             //展示所有电影的方法
                    break;
                }
                case 2:{
                    System.out.println("请输入要播放的影片：");
                    String name = sc.next();
                    work.play(name);                            //播放电影的方法
                    break;
                }
                case 3:{
                    System.out.println("请选择类型(1.电影 2.电视剧)");
                    int type = sc.nextInt();
                    if (type == 1){
                        System.out.println("请输入名称：");
                        String name = sc.next();
                        System.out.println("请输入主演：");
                        String actor = sc.next();
                        System.out.println("请输入时长：");
                        int time = sc.nextInt();
                        // 格式：Film(String name, String actor, int time)
                        Video film = new Film(name,actor,time);
                        //调用方法
                        work.addFiles(film);
                    }
                    if (type == 2){
                        System.out.println("请输入名称：");
                        String name = sc.next();
                        System.out.println("请输入主演：");
                        String actor = sc.next();
                        System.out.println("请输入集数：");
                        int num = sc.nextInt();
                        Video tel = new Teleplay(name,actor,num);
                        work.addFiles(tel);
                    }
                    break;
                }
                case 4:{
                    System.out.println("请输入要删除的影片：");
                    String name = sc.next();
                    work.doDel(name);
                    break;
                }
                case 5:{
                    System.out.print("退出时间为：");
                    System.out.print(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("您输入的编号错误，请重新输入！");
                }
            }
        }
    }
}
