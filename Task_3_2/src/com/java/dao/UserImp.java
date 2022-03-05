package com.java.dao;

import com.java.bean.User;
import com.java.utlis.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserImp implements UserDao{
    @Override
    public User login(String name, String psw) {
        String sql = "select * from admin where adminName = ? and adminPwd = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,psw);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close();
        }
        return null;
    }
}
