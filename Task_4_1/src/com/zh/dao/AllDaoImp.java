package com.zh.dao;

import com.zh.bean.Doctor;
import com.zh.bean.Game;
import com.zh.bean.User;
import com.zh.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AllDaoImp implements AllDao{
    //登录功能
    @Override
    public User login(String name, String pwd) {
        String sql = "select * from user where uName = ? and uPwd = ?";
        try {
            Connection con = null;
            try {
                con = JDBCUtils.getCon();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,pwd);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new User(
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

    //验证功能
    @Override
    public int verify(String name) {
        String sql = "select * from user where uName = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //注册功能
    @Override
    public int addUser(User user) {
        String sql = "insert into user values (null,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getuName());
            ps.setString(2, user.getuPwd());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //查询所有医生信息
    @Override
    public List<Doctor> findAll() {
        ArrayList<Doctor> list = new ArrayList<>();
        String sql = "select * from doctor";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Doctor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //批量删除
    @Override
    public int delAll(String id) {
        String sql = "delete from doctor where id in ("+id+")";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //添加医生信息
    @Override
    public int addDoc(Doctor doc) {
        String sql = "insert into doctor values (null,?,?,?,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, doc.getName());
            ps.setString(2, doc.getGender());
            ps.setString(3, doc.getHobby());
            ps.setString(4,doc.getBrith());
            ps.setString(5, doc.getDepName());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //查找医生个人信息
    @Override
    public Doctor byId(int id) {
        String sql = "select * from doctor where id = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Doctor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //修改医生信息
    @Override
    public int update(Doctor doc) {
        String sql = "update doctor set name = ?,gender = ?,hobby = ?,brith = ?,depName = ? where id = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, doc.getName());
            ps.setString(2, doc.getGender());
            ps.setString(3, doc.getHobby());
            ps.setString(4, doc.getBrith());
            ps.setString(5, doc.getDepName());
            ps.setInt(6,doc.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //删除医生信息
    @Override
    public int del(int id) {
        String sql = "delete from doctor where id = ?";
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
    public List<Game> findGame() {
        String sql = "select * from game order by score desc";
        ArrayList<Game> listGame = new ArrayList<>();
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listGame.add(new Game(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listGame;
    }
}
