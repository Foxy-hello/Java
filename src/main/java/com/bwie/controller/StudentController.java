package com.bwie.controller;

import com.bwie.pojo.Student;
import com.bwie.pojo.User;
import com.bwie.service.StudentService;
import com.bwie.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("list")
    public String list(Model model,String cpage,String mohu){
        HashMap<String, Object> map = new HashMap<>();
        map.put("mohu",mohu);
        List<Student> studentList = studentService.findStudentList(map);
        PageUtil pageUtil = new PageUtil(cpage, 2, studentList.size());

        map.put("pageUtil",pageUtil);
        studentList = studentService.findStudentListByParam(map);

        model.addAttribute("studentList",studentList);
        model.addAttribute("pageUtil",pageUtil);
        model.addAttribute("map",map);
        return "list";
    }

    @RequestMapping("login")
    @ResponseBody
    public Boolean login(User user, HttpSession session){

        User user1 = studentService.login(user);
        if (user1!=null){
            session.setAttribute("user1",user1);
            return true;
        }
        return false;
    }

}
