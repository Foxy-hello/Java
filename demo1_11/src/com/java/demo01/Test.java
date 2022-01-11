package com.java.demo01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Flower> hm = new HashMap<>();
        hm.put(1,new Flower("玫瑰",12.5));
        hm.put(2,new Flower("杜鹃",11.5));
        hm.put(3,new Flower("牡丹",10.5));
        hm.put(4,new Flower("康乃馨",8.5));
        hm.put(5,new Flower("美人蕉",15.5));
        //遍历输出
        Set<Map.Entry<Integer, Flower>> en = hm.entrySet();
        for (Map.Entry<Integer, Flower> flo : en) {
            System.out.println("编号: "+flo.getKey()+"\t"+" 花信息: "+flo.getValue().getName()+",价格: "+flo.getValue().getScore());
        }
        //查找Map中是否有“满天星”花，有则输出其价格，无则提示“没有满天星花”
        Iterator<Map.Entry<Integer, Flower>> it = en.iterator();
        boolean flag = false;
        while (it.hasNext()){
            Map.Entry<Integer, Flower> next = it.next();
            if (next.getValue().getName().equals("满天星")){
                System.out.println(next);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("没有满天星这个花！");
        }
        //删除Map中编号为3的花
        Iterator<Map.Entry<Integer, Flower>> it2 = en.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, Flower> next = it2.next();
            if (next.getKey() == 3){
                it2.remove();
            }
        }
        System.out.println("删除后的遍历是");
        for (Map.Entry<Integer, Flower> flo : en) {
            System.out.println("编号: "+flo.getKey()+"\t"+" 花信息: "+flo.getValue().getName()+",价格: "+flo.getValue().getScore());
        }
        //⑧　修改Map中编号2的花，将价格修改为11.2   根据键获取对应get(key)
        Iterator<Map.Entry<Integer, Flower>> it3 = en.iterator();
        while (it3.hasNext()){
            Map.Entry<Integer, Flower> next = it3.next();
            if (next.getKey() == 2){
                next.getValue().setScore(11.2);
            }
        }
        System.out.println("修改价格之后的遍历是");
        for (Map.Entry<Integer, Flower> flo : en) {
            System.out.println("编号: "+flo.getKey()+"\t"+" 花信息: "+flo.getValue().getName()+",价格: "+flo.getValue().getScore());
        }
        //定义TreeSet集合，将Map中所有花的信息装入TreeSet集合
        // TreeSet<Flower>    tr.addAll(map.values())
        TreeSet<Flower> tree = new TreeSet<>();
        tree.addAll(hm.values());
        System.out.println();
        for (Flower flower : tree) {
            System.out.println(flower);
        }


    }
}
