package com.zh.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zh.pojo.Course;
import com.zh.pojo.Stu;
import com.zh.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StuController {
    @Autowired
    StuService stuService;
    @RequestMapping("findAll")
    public String findAll(@RequestParam(defaultValue = "1")Integer pageNum, Model model){
        Page<Object> page = PageHelper.startPage(pageNum, 3);
        model.addAttribute("page",page);
        List<Stu> list = stuService.findAll();
        model.addAttribute("list",list);
        return "findAll";
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(Integer sId){
        return stuService.del(sId);
    }

    @RequestMapping("findCourseName")
    @ResponseBody
    public List<Course>findCourseName(){
        return stuService.findCourseName();
    }

    @RequestMapping("insert")
    @ResponseBody
    public int insert(Stu stu){
        return stuService.insert(stu);
    }

    @RequestMapping("findById")
    @ResponseBody
    public Stu findById(Integer sId){
        return stuService.findById(sId);
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Stu stu){
        return stuService.update(stu);
    }

}
