package com.zh.dao;

import com.zh.bean.Admin;
import com.zh.bean.User;
import com.zh.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImp implements UserDao {
    //查询所有的方法
    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<User> list = new ArrayList<>();
        try {
            con = JDBCUtils.getCon();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,ps,con);
        }
        return list;
    }
    //通过id查询返回一个对象
    @Override
    public User findById(int id) {
        String sql = "select * from user where id = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBCUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()){
                return new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,ps,con);
        }
        return null;
    }
    //通过id删除
    @Override
    public int del(int id) {
        String sql = "delete from user where id = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = JDBCUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(ps,con);
        }
        return 0;
    }
    //添加的方法
    @Override
    public int insert(User user) {
        String sql = "insert into user values (0,?,?,?,?,?,?)";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = JDBCUtils.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getSex());
            ps.setInt(3,user.getAge());
            ps.setString(4,user.getMail());
            ps.setString(5,user.getPhone());
            ps.setString(6,user.getAddress());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(ps,con);
        }
        return 0;
    }
    //删除的方法
    @Override
    public int update(int id) {
        String sql = "delete from user where id = ?";
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
    public Admin login(Admin admin) {
        String sql = "select * from admin where adminName = ? and adminPwd = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,admin.getAdminName());
            ps.setString(2,admin.getAdminPwd());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Admin(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
