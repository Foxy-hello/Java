package com.bwie.dao;

import com.bwie.pojo.Student;
import com.bwie.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface StudentDAO {
    List<Student> findStudentList(HashMap<String, Object> map);

    List<Student> findStudentListByParam(HashMap<String, Object> map);

    User login(User user);

}
