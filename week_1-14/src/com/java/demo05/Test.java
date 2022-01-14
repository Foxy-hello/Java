package com.java.demo05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("D:/work_java/week_1-14/src/com/java/demo05/login.properties");
        if (!file.exists()){
            file.createNewFile();
        }
        while (true){
            System.out.println("1.注册 2.登录");
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    System.out.println("请输入用户名:");
                    String name = sc.next();
                    System.out.println("请输入密码：");
                    String psw = sc.next();
                    //把密码写到配置文件中
                    Properties ppt = new Properties();
                    ppt.setProperty(name,psw);
                    ppt.store(new FileWriter(file,true),"ID and password");
                    System.out.println("注册成功!");
                    break;
                }
                case 2:{
                    System.out.println("请输入用户名：");
                    String nameTwo = sc.next();
                    System.out.println("请输入密码：");
                    String pswTwo = sc.next();
                    //加载配置文件
                    Properties ppt2 = new Properties();
                    ppt2.load(new FileReader(file));
                    String s = ppt2.getProperty(nameTwo);
                    if (s != null){
                        if (s.equals(pswTwo)){
                            System.out.println("登录成功");
                        }else{
                            System.out.println("登录失败！");
                        }
                    }else{
                        System.out.println("账号错误，请重新输入！");
                    }
                    break;
                }
                default:{
                    System.out.println("输入错误，请重新输入！");
                }
            }
        }
    }
}
