package com.zh.dao;

import com.zh.bean.User;
import com.zh.utlis.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImp implements UserDao{
    @Override
    public int insert(User user) {
        String sql = "insert into user values (null,?,?,?,?,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getSex());
            ps.setInt(3,user.getAge());
            ps.setString(4,user.getMail());
            ps.setString(5,user.getPhone());
            ps.setString(6,user.getAddress());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
