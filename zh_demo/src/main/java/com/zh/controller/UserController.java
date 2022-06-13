package com.zh.controller;

import cn.hutool.jwt.JWT;
import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSONObject;
import com.zh.bean.*;
import com.zh.service.UserService;
import com.zh.utils.GitUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(User user, HttpServletResponse response){
        User us = userService.login(user);
        if (us != null){
            String Token = JWT.create().setPayload("uname", user.getUname()).setKey("123456".getBytes()).sign();
            Cookie cookie = new Cookie("Token", Token);
            cookie.setMaxAge(30*60);
            cookie.setDomain("localhost");
            response.addCookie(cookie);
            return "redirect:findAll";
        }else{
            return "redirect:index.jsp";
        }
    }

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Student> list = userService.findAll();
        model.addAttribute("list",list);
        return "findAll";
    }

    @RequestMapping("goEcharts")
    public String goEcharts(){
        return "StuEcharts";
    }

    @RequestMapping("getEchartsNum")
    @ResponseBody
    public Object getEchartsNum(){
        return userService.getEchartsNum();
    }

    @RequestMapping("getExcel")
    public ResponseEntity<byte[]>getExcel() throws IOException {
        List<Student> list = userService.findAll();
        EasyExcel.write("student.xls",Student.class).sheet("学生住宿情况").doWrite(list);
        File file = new File("student.xls");
        HttpHeaders headers = new HttpHeaders();
        String downFile = new String("student.xls".getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        headers.setContentDispositionFormData("myFileDown",downFile);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }

    @RequestMapping("GitLogin")
    public String GitLogin(){
        String authorize = GitUtils.authorize();
        return "redirect:"+authorize;
    }

    @RequestMapping("callback")
    public String callback(String code,HttpServletResponse response){
        String userInfoByCode = GitUtils.getUserInfoByCode(code);
        GitBean gitBean = JSONObject.parseObject(userInfoByCode, GitBean.class);
        if (gitBean.getId() != null){
            String Token = JWT.create().setPayload("id", gitBean.getId()).setKey("123456".getBytes()).sign();
            Cookie cookie = new Cookie("Token", Token);
            cookie.setMaxAge(30*60);
            cookie.setDomain("localhost");
            response.addCookie(cookie);
            return "redirect:findAll";
        }else {
            return "index.jsp";
        }
    }

    @RequestMapping("toUpd")
    public String toUpd(){
        return "upd";
    }

    @RequestMapping("getStu")
    @ResponseBody
    public Object getStu(){
        return userService.getStu();
    }

    @RequestMapping("getLou")
    @ResponseBody
    public Object getLou(){
        return userService.getLou();
    }

    @RequestMapping("getDormitory")
    @ResponseBody
    public Object getDormitory(){
        return userService.getDormitory();
    }

    @RequestMapping("upd")
    @ResponseBody
    public int upd(Mi mi){
        return userService.upd(mi);
    }

}
