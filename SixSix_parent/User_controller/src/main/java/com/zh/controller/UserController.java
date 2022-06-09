package com.zh.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.generator.RandomGenerator;
import com.zh.bean.User;
import com.zh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(100,40);
    RandomGenerator randomGenerator = new RandomGenerator(4);

    @RequestMapping("findName")
    @ResponseBody
    public boolean findName(String name){
        boolean flag = userService.findName(name);
        return !flag;
    }

    @RequestMapping("insertUser")
    public String insertUser(User user,String vcode){
        if (lineCaptcha.verify(vcode)){
            int i =  userService.insertUser(user);
        }
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public int login(String name,String pwd,String vcode){
        if (lineCaptcha.verify(vcode)){
            return userService.login(name,pwd);
        }
        return 0;
    }

    @RequestMapping("getcode")
   public void getcode(HttpServletResponse response){
        lineCaptcha.setGenerator(randomGenerator);
        lineCaptcha.createCode();
        try {
            lineCaptcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
