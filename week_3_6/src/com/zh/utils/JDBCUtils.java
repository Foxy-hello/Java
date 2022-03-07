package com.zh.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    private static String driver;
    private static String url;
    private static String name;
    private static String pwd;

    static {
        try {
            FileInputStream file = new FileInputStream("D:/work_java/Work_Space/week_3_6/src/com/zh/utils/db.properties");
            Properties pro = new Properties();
            pro.load(file);
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            name = pro.getProperty("name");
            pwd = pro.getProperty("pwd");
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(url,name,pwd);
    }

    public static void closes(AutoCloseable... args){
        if (args != null){
            for (AutoCloseable arg : args) {
                try {
                    arg.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
