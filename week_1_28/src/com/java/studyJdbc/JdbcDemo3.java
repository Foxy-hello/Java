package com.java.studyJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
    public static void main(String[] args) {
        //1.注册驱动
        Connection conn = null ;
        Statement stat = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接对象
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhouhan", "root", "root");
                //3.定义sql
                String sql = "update emp set age = 55 where id = 6";
                //4.获取执行sql对象
                 stat = conn.createStatement();
                int count = stat.executeUpdate(sql);
                System.out.println(count);
                if (count > 0){
                    System.out.println("修改成功");
                }else{
                    System.out.println("修改失败");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            if (stat!=null){
                try {
                    stat.close();
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
