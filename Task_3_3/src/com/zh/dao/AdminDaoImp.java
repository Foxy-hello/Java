package com.zh.dao;

import com.zh.bean.Admin;
import com.zh.utlis.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDaoImp implements AdminDao{
    @Override
    public int insert(Admin admin) {
        String sql = "insert into admin values (null,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
