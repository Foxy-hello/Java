package com.zh.service;

import com.zh.pojo.Course;
import com.zh.pojo.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuService {
    List<Stu> findAll();
    int del(Integer sId);
    List<Course>findCourseName();
    int insert(Stu stu);

    Stu findById(Integer sId);

    int update(Stu stu);
}
