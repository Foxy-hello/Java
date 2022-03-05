package com.zh.utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql:///mr_zhou","root","root");
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
