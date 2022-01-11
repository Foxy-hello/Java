package com.java.demo03;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Integer, User> lhm = new LinkedHashMap<>();
        lhm.put(3,new User("赵六",12,"男"));
        lhm.put(4,new User("田七",17,"女"));
        lhm.put(5,new User("王五",15,"女"));
        lhm.put(15,new User("张三",14,"男"));
        lhm.put(19,new User("笑笑",7,"男"));

        Set<Map.Entry<Integer, User>> en = lhm.entrySet();
        for (Map.Entry<Integer, User> inTe : en) {
            System.out.println("序号："+inTe.getKey()+" 姓名： "+
                    inTe.getValue().getName()+" 年龄： "+inTe.getValue().getAge()+
                    " 性别："+inTe.getValue().getSex());
        }

        User max = Collections.max(lhm.values(), new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("年纪最大的客户是： "+max);
        User min = Collections.min(lhm.values(), new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("年纪最小的客户是： "+min);


    }
}
