package com.zh.dao;

import com.zh.pojo.Course;
import com.zh.pojo.Stu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuDao {
    List<Stu>findAll();

    int del(@Param("sId") Integer sId);

    List<Course>findCourseName();

    int addStu(Stu stu);

    void addCourse(@Param("sId") Integer sId, @Param("s") String s);

    Stu findById(@Param("sId") Integer sId);

    void delStu(@Param("sId") Integer sId);

    int update(Stu stu);

    int updateStu(Stu stu);
}
