package com.zh.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

    public static String driver;
    public static String url;
    public static String name;
    public static String pwd;
    //读取文件，注册驱动
    static {
        try {
            FileInputStream file = new FileInputStream("D:\\work_java\\Work_Space\\Task_3_5\\src\\com\\zh\\utils\\db.properties");
            Properties pro = new Properties();
            pro.load(file);
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            name = pro.getProperty("user");
            pwd = pro.getProperty("pwd");
            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取连接对象
    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(url,name,pwd);
    }
    //关闭流
    public static void close(AutoCloseable...args){
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
