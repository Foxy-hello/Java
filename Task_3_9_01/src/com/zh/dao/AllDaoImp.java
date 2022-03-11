package com.zh.dao;

import com.zh.baan.Cls;
import com.zh.baan.Stu;
import com.zh.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AllDaoImp implements AllDao{
    @Override
    public List<Stu> findAll() {
        String sql = "select * from stu left join cls c on stu.cid = c.cid";
        ArrayList<Stu> list = new ArrayList<>();
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Stu(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insert(Stu stu) {
        String sql = "insert into stu values (0,?,?,?,?,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,stu.getsName());
            ps.setString(2,stu.getSex());
            ps.setInt(3,stu.getAge());
            ps.setString(4,stu.getHappy());
            ps.setString(5,stu.getTime());
            ps.setInt(6,stu.getCid());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Stu findById(int id) {
        String sql = "select * from stu where sid = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Stu(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        ""
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int update(Stu stu) {
        String sql = "update stu set sName = ?,sex = ?,age = ?,happy = ?,time = ?,cid = ? where sid = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,stu.getsName());
            ps.setString(2,stu.getSex());
            ps.setInt(3,stu.getAge());
            ps.setString(4, stu.getHappy());
            ps.setString(5,stu.getTime());
            ps.setInt(6,stu.getCid());
            ps.setInt(7,stu.getSid());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int del(int id) {
        String sql = "delete from stu where sid = ?";
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
    public List<Stu> fuzzy(String name, String stars, String end, String cid) {
        String sql = "select * from stu left join cls c on stu.cid = c.cid where 1 = 1";
        if (name != ""){
            sql += " and sName like '%"+name+"%'";
        }if (stars != "" && end != ""){
            sql += " and time >= ? and time <=?";
        }if (cid != ""){
            sql += " and stu.cid = "+cid;
        }
        ArrayList<Stu> list = new ArrayList<>();
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            if (stars != "" && end != ""){
                ps.setString(1,stars);
                ps.setString(2,end);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Stu(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Cls> findCls() {
        String sql = "select * from cls";
        ArrayList<Cls> list = new ArrayList<>();
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Cls(
                        rs.getInt(1),
                        rs.getString(2)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
