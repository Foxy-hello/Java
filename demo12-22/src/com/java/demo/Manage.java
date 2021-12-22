package com.java.demo;

import javax.naming.Name;

public class Manage {
    //（5）图书管理类中定义Book数组（长度10）用于存储图书，
    // 定义增加图书的方法addBook(Book b)用于将图书存储到数组中去，返回true或false表示图书是否增加成功
    // （数组满了会增加失败）。定义showAll()方法用于遍历输出数组中所有图书的详细信息。
    Book[]arr = new Book[10];
    int count = 0;
    //定义增加图书的方法addBook(Book b)用于将图书存储到数组中
    public boolean addBook(Book b){
        //调用重名方法
        int index = this.feedName(b.getName());
        if (index == -1){
            arr[count++] = b;
            return true;
        }
        return false;
    }
    //定义showAll()方法用于遍历输出数组中所有图书的详细信息
    public void showAll(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.println(arr[i]);
            }
        }
    }
    //定义删除方法返回布尔类型，删除图书信息
    public boolean doDel(String name){
        //判断重名
        int index02 = this.feedName(name);
        if (index02 != -1){
            for (int i = index02; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
                return true;
            }
            count--;
        }
        return false;
    }
    //定义退出的方法
    public void exit(){
        System.out.println("谢谢使用，再见");
        System.exit(0);
    }
    //判断重名的方法
    public int feedName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }


}
