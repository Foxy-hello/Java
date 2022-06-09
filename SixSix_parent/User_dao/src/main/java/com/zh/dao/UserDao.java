package com.zh.dao;

import com.zh.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    boolean findName(
            @Param("name") String name);


    int insertUser(User user);

    int login(
           @Param("name") String name,
           @Param("newPwd") String newPwd);
}
