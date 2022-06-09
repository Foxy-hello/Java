package com.zh.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.generator.RandomGenerator;
import com.zh.service.UserService;
import com.zh.utils.ZhenZiYun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    RedisTemplate redisTemplate;

    private LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(80,50);
    RandomGenerator randomGenerator = new RandomGenerator(4);

    @RequestMapping("getCode")
    public void getCode(HttpServletResponse response){
        lineCaptcha.setGenerator(randomGenerator);
        lineCaptcha.createCode();
        try {
            lineCaptcha.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("sendPhone")
    @ResponseBody
    public String sendPhone(String phone){
        int number = (int) ((Math.random()) * (9999 - 1000 + 1) + 1000);
        BoundValueOperations pcode = redisTemplate.boundValueOps("pcode");
        pcode.set(number,120,TimeUnit.SECONDS);
        return ZhenZiYun.send(phone, number + "", "2");
    }


}
