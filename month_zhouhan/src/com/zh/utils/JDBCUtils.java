package com.zh.utils;

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
        return DriverManager.getConnection("jdbc:mysql:///db_month","root","root");
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
