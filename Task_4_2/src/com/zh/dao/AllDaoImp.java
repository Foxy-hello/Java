package com.zh.dao;

import com.zh.bean.T_food;
import com.zh.bean.T_type;
import com.zh.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AllDaoImp implements AllDao{
    //双表联查
    @Override
    public List<T_food> findFoods() {
        String sql = "select * from t_food left join t_type tt on t_food.tid = tt.tid";
        ArrayList<T_food> list = new ArrayList<>();
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new T_food(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(8)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //添加
    @Override
    public int addFood(T_food food) {
        String sql = "insert into t_food values (null,?,?,?,?,?)";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, food.getfName());
            ps.setDouble(2,food.getPrice());
            ps.setString(3, food.getTime());
            ps.setString(4, food.getContent());
            ps.setInt(5,food.getTid());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //查询单个菜品,根据ID查菜品
    @Override
    public T_food findById(int id) {
        String sql = "select * from t_food where fid = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                return new T_food(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        ""
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //修改菜品
    @Override
    public int update(T_food food) {
        String sql = "update t_food set fName = ?,price = ?,time = ?,content = ?,tid = ? where fid = ?";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,food.getfName());
            ps.setDouble(2,food.getPrice());
            ps.setString(3,food.getTime());
            ps.setString(4, food.getContent());
            ps.setInt(5,food.getTid());
            ps.setInt(6,food.getFid());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //模糊查询
    @Override
    public List<T_food> fuzzy(String name, String start, String end) {
        ArrayList<T_food> list = new ArrayList<>();
        String sql = "select * from t_food left join t_type tt on t_food.tid = tt.tid where 1 = 1";
        if (name != ""){
            sql += " and fName like '%"+name+"%'";
        }if (start != "" && end != ""){
            sql += " and time > ? and time < ?";
        }
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            if (start != "" && end != ""){
                ps.setString(1,start);
                ps.setString(2,end);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new T_food(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(8)
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
        String sql = "delete from t_food where fid in ("+id+")";
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //单个删除
    @Override
    public int del(int id) {
        String sql = "delete from t_food where fid  = ?";
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

    //菜品
    @Override
    public List<T_type> findType() {
        String sql = "select * from t_type";
        ArrayList<T_type> list = new ArrayList<>();
        try {
            Connection con = JDBCUtils.getCon();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                list.add(new T_type(
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
