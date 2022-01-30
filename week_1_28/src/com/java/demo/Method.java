package com.java.demo;

import Unitls.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Method {
    public List<Emp> FinalAll(){
        List<Emp> list = new ArrayList<>();
        Emp emp = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        //创建驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhouhan", "root", "root");
                stmt = conn.createStatement();
                String sql = "select * from emp";
                rs = stmt.executeQuery(sql);
                while (rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("NAME");
                    int age = rs.getInt("age");
                    String dep_name = rs.getString("dep_name");
                    String dep_location = rs.getString("dep_location");
                    emp = new Emp();
                    emp.setId(id);
                    emp.setNAME(name);
                    emp.setAge(age);
                    emp.setDep_name(dep_name);
                    emp.setDep_location(dep_location);
                    list.add(emp);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }

}
