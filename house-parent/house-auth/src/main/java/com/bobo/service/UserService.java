package com.bobo.service;

import com.bobo.pojo.User;

public interface UserService {

    /**
     * 根据用户名查询对象
     * @param name
     * @return
     */
    User getByName(String name);
}
