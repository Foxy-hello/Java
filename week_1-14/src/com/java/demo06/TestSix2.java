package com.java.demo06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestSix2 {
    public static void main(String[] args) throws Exception {
        //读取再创建一个测试类，在main方法中通过对象反序列化读取“employee.txt”文件中的内容，
        // 还原员工对象信息，并将这些对象放入到List集合当中（集合要加入泛型）。
        File file = new File("20220114/employee.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        ArrayList<Employee> list  = (ArrayList<Employee>)ois.readObject();
        for (Employee employee : list) {
            System.out.println(employee);
        }
        //并使用Collections找到薪资最多的员工，输出其名称以及薪资。
        //使用Collections找到薪资最少的员工，输出其名称以及薪资
        Employee max = Collections.max(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) o1.getMoney() - (int) o2.getMoney();
            }
        });
        System.out.println("薪资最多的员工是： "+max.getName()+","+max.getMoney());

        Employee min = Collections.min(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) o1.getMoney() - (int) o2.getMoney();
            }
        });
        System.out.println("薪资最少的员工是： "+min.getName()+","+min.getMoney());



    }
}
