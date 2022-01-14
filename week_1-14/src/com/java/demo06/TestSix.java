package com.java.demo06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TestSix {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyyMMdd");
        String format = sim.format(new Date());
        //在项目目录下创建指定名称的文件夹（判断是否存在，不存在创建）
        File file = new File(format);
        if (!file.exists()){
            file.mkdir();
        }
        //在该文件夹中，生成以“员工信息.txt”为名的txt文档
        File file1 = new File(format, "员工信息.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        //使用IO流的相关类将以下信息写入“员工信息.txt”中
        PrintWriter pw = new PrintWriter(file1);
        pw.write("张三|男|22|齐齐哈尔|8000.0\n" +
                "李四|女|4|哈尔滨|7000.0\n" +
                "王五|男|26|大庆|9000.0\n" +
                "赵六|女|25|佳木斯|8500.0\n");
        pw.close();
        //根据数据含义，自行设计:员工类Employee(姓名，性别，年龄，地址，薪资)用于存储解析的数据和序列化保存
        ArrayList<Employee> list = new ArrayList<>();
        String str = "";
        BufferedReader br = new BufferedReader(new FileReader(file1));
        while ((str = br.readLine())!=null){
            String[] spl = str.split("\\|");
            Employee emp = new Employee(spl[0],spl[1],Integer.parseInt(spl[2]),spl[3],Double.parseDouble(spl[4]));
            list.add(emp);
        }
        //用序列化方式，将每行实例化的员工对象保存到今日日期的文件夹的“employee.txt”文件中
        File filEmp = new File(format,"employee.txt");
        if (!filEmp.exists()){
            filEmp.createNewFile();
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filEmp));
        oos.writeObject(list);
        oos.close();



    }
}
