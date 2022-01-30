package com.java.studyJdbc;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhouhan", "root", "root");
                String sql = "delete from emp where id = 7";
                 stmt = conn.createStatement();
                int count = stmt.executeUpdate(sql);
                System.out.println(count);
                if (count > 0){
                    System.out.println("删除成功！");
                }else{
                    System.out.println("删除失败！");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
