package com.zh.dao;

import com.zh.bean.Admin;
import com.zh.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoImp implements AdminDao{
    @Override
    public Admin login(Admin admin) {
        String sql = "select * from admin where adminName = ? and adminPwd = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Admin> findAll() {
        ArrayList<Admin> list = new ArrayList<>();
        try {
            String sql = "select * from admin";
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Admin admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int add(Admin admin) {
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

    @Override
    public int del(int id) {
        String sql = "delete from admin where adminId = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Admin admin) {
        String sql = "update admin set adminName = ? ,adminPwd = ? where adminId = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());
            ps.setInt(3,admin.getAdminId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Admin findById(int id) {
        String sql = "select * from admin where adminId = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Admin findID(int id) {
        String sql = "select * from admin where adminId = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
