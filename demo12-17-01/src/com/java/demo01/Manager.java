package com.java.demo01;


import java.util.Scanner;

public class Manager {
    Scanner sc  = new Scanner(System.in);
    //定义一个字符串数组，长度为200
    String []arr = new String[200];
    int count = 0;
    //判断重名的方法，如果存在，返回数组下标，如果不存在，则返回-1！find 寻找
    public int findName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(name)){ //判断 遍历数组，如果数组里面的数不为空，并且数组里面的数等于传过来的参数
                return i;      //条件正确的话，返回这个数的下标
            }
        }
        return -1;             //条件不正确的话，返回-1的值！
    }
    //1.收藏
    //定义第一个方法 add 为收藏
    public void add(){
        System.out.println("请输入你要输入的单词："); //提示输入
        String word = sc.next(); //word 输入的单词
        //调用重名方法，进行判断
        int index = this.findName(word);
        if (index == -1){
            arr[count++] = word;
        }
        else{
            System.out.println("亲，这个单词已经被收藏过啦~");
        }

    }

    //2.显示所有收藏的单词
    //选择2时，显示已经收藏的所有单词，如果没有收藏任何单词（第一个元素为null时）显示没有收藏任何单词，
    //如果寻找到这个单词，则按照五个一行输出
    public void findAll(){   //findAll  寻找收藏的单词
        if (arr[0] == null){
            System.out.println("没有收藏任何单词");
        }else{
            for (int i = 0; i < arr.length; i++) {      //遍历寻找所有单词
                if (arr[i] != null){        //条件，数组不为空，每5个换行
                    if (i % 5 == 0){
                        System.out.println();
                    }
                    System.out.print(arr[i]+" ");     //输出这些单词
                }
            }
        }
    }

    //3.删除单词
    //选择3时，如果单词不存在，则显示提示单词没有收藏过，无需删除，如果单词存在，则删除，并且，提示删除成功！
    public void delete(){
        System.out.println("请输入需要删除的单词：");
        String delWord = sc.next();     // delWord 删除单词的变量
        //判断重名
        int index02 = this.findName(delWord);
        if (index02 == -1){
            //如果返回数值是-1，则表示没有这个单词，无需删除
            System.out.println("这个单词没有被收藏，无需删除");
        }else{
            for (int i = index02; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            count--;
            System.out.println("删除成功！");
        }
    }
}
