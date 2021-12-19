package com.java.demo011;

import java.util.Scanner;

public class MangerOne {
    String []arr = new String[200];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    //判断重复值方法
    public int feedName(String name){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(name)){
                return 1;
            }
        }
        return -1;
    }
    //定义收藏方法
    public void add(){
        System.out.println("请输入你要收藏的单词");
        String word = sc.next();
        int index = this.feedName(word);
        if (index == -1){
            arr[count++] = word;
        }else{
            System.out.println("这个单词已经被收藏了，无需再次收藏");
        }
    }

    //定义显示所有单词的方法，如果第一个为空，则输出提示，反之，则输出所有收藏的单词，每五个进行换行
    public void feedAll(){
        if (arr[0] == null){
            System.out.println("没有收藏任何单词呢！");
        }else{
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null){
                    if (i % 5 == 0){
                        System.out.println();
                    }
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    //定义删除方法，遍历数组，如果存在则删除数据，如果不存在则给出提示
    public void doDel(){
        System.out.println("请输入需要删除的单词：");
        String delWord = sc.next();
        //判断重名
        int index02 = this.feedName(delWord);
        if (index02 == -1){
            System.out.println("没有这个单词，不需要删除");
        }else{
            for (int i = index02; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            count--;
        }
        System.out.println("删除成功！\n");
        }

}
