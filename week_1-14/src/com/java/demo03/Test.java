package com.java.demo03;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File f1 = new File("E:/IO/ac125.jpg");
        File f2 = new File("E:/IO/pic/tu.jpg");
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(f1));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(f2));
        int len = 0;
        while ((len = bi.read())!=-1){
            bo.write(len);
        }
        bi.close();
        bo.close();
    }
}
