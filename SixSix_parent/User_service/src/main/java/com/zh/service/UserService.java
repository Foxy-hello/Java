package com.zh.service;

import com.zh.bean.User;

public interface UserService {

    public static final String SALT = "@92mka*sdn2$fsdal2%1msfx^msdf12.5asd!asd.,sad;";

    boolean findName(String name);


    int insertUser(User user);

    int login(String name, String pwd);

}
