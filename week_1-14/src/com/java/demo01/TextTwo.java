package com.java.demo01;

import java.io.*;

public class TextTwo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/IO/a.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s = br.readLine();
        System.out.println(s);
    }
}
