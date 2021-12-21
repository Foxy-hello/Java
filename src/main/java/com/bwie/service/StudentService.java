package com.bwie.service;

import com.bwie.dao.StudentDAO;
import com.bwie.pojo.Student;
import com.bwie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> findStudentList(HashMap<String, Object> map) {
        return studentDAO.findStudentList(map);
    }

    public List<Student> findStudentListByParam(HashMap<String, Object> map) {
        return studentDAO.findStudentListByParam(map);
    }

    public User login(User user) {
        return studentDAO.login(user);
    }
}
