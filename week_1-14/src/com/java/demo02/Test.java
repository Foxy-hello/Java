package com.java.demo02;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        File file = new File("student.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        ArrayList<Student> list = new ArrayList<>();
        System.out.println("请输入要存储的信息(zs,12) Q 退出");
        while (true){
            String next = sc.next();
            if (next.equals("Q")){
                break;
            }else{
                String[] spl = next.split(",");
                Student stud = new Student(spl[0] , Integer.parseInt(spl[1]));
                list.add(stud);
            }
        }
        //循环结束之后，使用对象序列化 将集合 存储到stu.txt 文件中
        ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(file));
        obj.writeObject(list);
        obj.close();
        System.out.println("序列化成功！");
        System.out.println();
        System.out.println("反序列化读取");
        //指定需要读取的文件
        File file1 = new File("student.txt");
        ObjectInputStream obi = new ObjectInputStream(new FileInputStream(file1));
        ArrayList<Student> o =(ArrayList<Student>) obi.readObject();
        for (Student student : o) {
            System.out.println(student);
        }
        obi.close();


    }
}
