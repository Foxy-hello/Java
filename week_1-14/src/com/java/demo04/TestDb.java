package com.java.demo04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestDb {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/work_java/week_1-14/src/com/java/demo04/db.properties");
        Properties p1 = new Properties();
        p1.setProperty("name","李四");
        p1.setProperty("psw","1234");
        p1.store(new FileWriter(file),"账号密码");

        p1.load(new FileReader(file));
        Set<Map.Entry<Object, Object>> ent = p1.entrySet();
        for (Map.Entry<Object, Object> oje : ent) {
            System.out.println(oje);
        }


    }
}
