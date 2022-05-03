package com.zh.service.impl;

import com.zh.dao.StuDao;
import com.zh.pojo.Course;
import com.zh.pojo.Stu;
import com.zh.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    StuDao stuDao;
    @Override
    public List<Stu> findAll() {
        return stuDao.findAll();
    }

    @Override
    public int del(Integer sId) {
        return stuDao.del(sId);
    }

    @Override
    public List<Course> findCourseName() {
        return stuDao.findCourseName();
    }

    @Override
    public int insert(Stu stu) {
        int i = stuDao.addStu(stu);
        String cIds = stu.getcIds();
        if (cIds.length() > 0){
            String[] arr = cIds.split(",");
            //循环添加中间表
            for (String s : arr) {
                System.out.println(s);
                stuDao.addCourse(stu.getsId(),s);
            }
        }
        return i;
    }

    @Override
    public Stu findById(Integer sId) {
        return stuDao.findById(sId);
    }

    @Override
    public int update(Stu stu) {
        stuDao.delStu(stu.getsId());
        System.out.println(stu);
        String str = "";
        if (stu.getcIds() != null){
            String arr = stu.getcIds();
            String[] spl = arr.split(",");
            for (String s : spl) {
                stuDao.addCourse(stu.getsId(),s);
            }
        }
        return stuDao.updateStu(stu);
    }
}
