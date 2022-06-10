package com.bobo.mapper;

import com.bobo.pojo.User;

public interface UserMapper {

    /**
     * 根据用户名查询对象
     * @param name
     * @return
     */
    User getByName(String name);
}
