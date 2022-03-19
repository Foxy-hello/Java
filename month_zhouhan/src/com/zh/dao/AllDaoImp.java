package com.zh.dao;

import com.zh.bean.Cuisine;
import com.zh.bean.Hotel;
import com.zh.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AllDaoImp implements AllDao{
    //查询所有的方法，双表联查
    @Override
    public List<Hotel> findAll() {
        ArrayList<Hotel> list = new ArrayList<>();
        String sql = "select * from hotel left join cuisine c on hotel.cid = c.cid";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Hotel(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //模糊查询
    @Override
    public List<Hotel> fuzzy(String name, String cid) {
        ArrayList<Hotel> list = new ArrayList<>();
        String sql = "select * from hotel left join cuisine c on hotel.cid = c.cid where 1 = 1 ";
        if (name != ""){
            sql += " and name like '%"+name+"%'";
        }if (cid != ""){
            sql += " and hotel.cid = "+cid;
        }
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Hotel(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //查询菜系
    @Override
    public List<Cuisine> findByCui() {
        ArrayList<Cuisine> list = new ArrayList<>();
        String sql = "select * from cuisine";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Cuisine(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //查询单个对象
    @Override
    public Hotel findByHo(int id) {
        String sql = "select * from hotel where id = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new Hotel(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        "",""
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //添加
    @Override
    public int add(Hotel hotel) {
        String sql = "insert into hotel values (null,?,?,?,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,hotel.getCid());
            ps.setString(2,hotel.getName());
            ps.setString(3,hotel.getDescription());
            ps.setString(4,hotel.getTime());
            ps.setInt(5,hotel.getState());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //修改所有，根据id修改
    @Override
    public int update(Hotel hotel) {
        String sql = "update hotel set cid = ?,name = ?,description = ?,time = ?,state = ? where id = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,hotel.getCid());
            ps.setString(2,hotel.getName());
            ps.setString(3,hotel.getDescription());
            ps.setString(4,hotel.getTime());
            ps.setInt(5,hotel.getState());
            ps.setInt(6,hotel.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int upState(int id, int state) {
        String sql = "update hotel set state = ? where id = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,state);
            ps.setInt(2,id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int del(int id) {
        String sql = "delete from hotel where id = ?";
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
}
