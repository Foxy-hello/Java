package com.java.demo02;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
        game.setName("王者荣耀");
        game.setAge(16);
        game.setType("团队竞技");
        game.setSex("女");

        System.out.println(game.getName());
        System.out.println(game.getAge()+"美少女");
        System.out.println(game.getType());
        System.out.println(game.getSex());
    }
}
