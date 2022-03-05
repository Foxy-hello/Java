package com.java.utlis;

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
    public static String psw;

    static {
        try {
            FileInputStream file = new FileInputStream("D:\\work_java\\Work_Space\\Task_3_2\\DB.properties");
            Properties pro = new Properties();
            pro.load(file);
            driver = pro.getProperty("Driver");
            url = pro.getProperty("url");
            name = pro.getProperty("name");
            psw = pro.getProperty("psw");
            Class.forName(driver);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(url,name,psw);
    }
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
