package com.java.demo02;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String next = sc.next();
        Way way = new Way();    //获取Way对象
        HashMap<Character, Integer> hm = way.show(next);    //调用方法，参数为输入的值
        Set<Map.Entry<Character, Integer>> en = hm.entrySet();      //转换成set
        Iterator<Map.Entry<Character, Integer>> it = en.iterator();
        while (it.hasNext()){
            Map.Entry<Character, Integer> next1 = it.next();        //遍历输出
            System.out.println(next1);
        }


    }


}
