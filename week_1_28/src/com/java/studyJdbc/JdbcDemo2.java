package com.java.studyJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args) {
        //注册驱动
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //定义sql
            String sql = "insert into emp values(7,'张无忌',28,'销售部','广州')";
            //获取执行对象
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhouhan", "root", "root");
                //执行对象
                stat = conn.createStatement();
                //执行sql
                int count = stat.executeUpdate(sql);
                System.out.println(count);
                if (count > 0){
                    System.out.println("添加成功！");
                }else{
                    System.out.println("添加失败！");
                }
                //释放资源

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
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
