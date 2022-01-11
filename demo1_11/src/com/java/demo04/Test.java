package com.java.demo04;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("请随意输入数字，按N结束");
        while (true){
            String mun = sc.next();
            if (mun.equals("N")){
                break;
            }else{
                list.add(Integer.parseInt(mun));
            }
        }
        Collections.sort(list);
        System.out.println("从小到大的排序是");
        for (Integer integer : list) {
            System.out.print(integer+"  ");
        }
        //输出最大最小值
        System.out.println();
        System.out.println("最大值是： "+Collections.max(list));
        System.out.println("最小值是： "+Collections.min(list));
        //使用Collections从排序好的集合里二分查找指定数据，找不到输出“没有这个数字”，找到则将该数字从集合中移除
        System.out.println("请输入需要查找的数字：");
        int sameNum = sc.nextInt();
        int i = Collections.binarySearch(list, sameNum);
        if (i < 0){
            System.out.println("没找到对应的数字");
        }else{
            System.out.println("下标是： "+i);
        }
        System.out.println("反序输出");
        Collections.reverse(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }



    }
}
