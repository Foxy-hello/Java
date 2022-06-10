package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/6/9 16:02
 */
@Controller
public class LoginController {

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("toLogin")
    public String  toLogin(){

        return  "login";
    }
}
