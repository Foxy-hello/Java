package com.java.demo01;

import java.io.*;
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) throws IOException {
        //通过BufferedWriter向磁盘文件中写入内容；
        //通过BufferedReader读取磁盘文件中的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要写入的内容：");
        String next = sc.next();
        File file = new File("aa.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(next);
        bw.close();
        System.out.println("写入成功！");
        System.out.println();
        System.out.println("读取内容如下");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = br.readLine();
        System.out.println(s);


    }
}
