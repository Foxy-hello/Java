package com.java.demo;

public class Test {
    //测试类中定义一个既可以放Dog，又可以放Penguin的数组，
    // 分别生成4个Dog，4	个Penguin放入该数组，
    // 并分别调用输出每个宠物信息和各自特有的跳高或游泳方法
    public static void main(String[] args) {
        Person per = new Dog("来福","95","85","哈士奇");
        Person per2 = new Dog("来福1","96","86","哈士奇");
        Person per3 = new Dog("来福2","97","87","哈士奇");
        Person per4 = new Dog("来福3","98","88","哈士奇");

        Penguin pen  =  new Penguin("企鹅","85","94","雄");
        Penguin pen2  =  new Penguin("企鹅1","86","93","雄");
        Penguin pen3  =  new Penguin("企鹅2","87","92","雄");
        Penguin pen4 =  new Penguin("企鹅3","88","91","雄");
        Person[]arr = new Person[]{per,per2,per3,per3,pen,pen2,pen3,pen4};
        for (int i = 0; i < arr.length; i++) {
            if (per instanceof Dog){
                per.show();
                Dog dog = (Dog)per;
                dog.show();
            }
            if (pen instanceof Penguin){
                pen.show();
                Penguin en = (Penguin)pen;
                en.show();
            }
        }

    }

}
