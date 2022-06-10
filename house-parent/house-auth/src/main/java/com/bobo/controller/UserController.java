package com.bobo.controller;

import cn.hutool.jwt.JWT;
import com.bobo.pojo.HouseResult;
import com.bobo.pojo.User;
import com.bobo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/6/9 15:54
 */
@CrossOrigin//跨域
@RequestMapping("auth")
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RedisTemplate redisTemplate;
    // 密钥
    byte[] key = "1234567890".getBytes();

    /**
     * 登录
     *
     * @param phone
     * @param code
     * @return
     */
    @ResponseBody
    @RequestMapping("login")
    public HouseResult login(String phone, String code) {
        HouseResult result = new HouseResult();

        if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(code)) {
            result.setCode(501);
            result.setName("手机号或短信验证码不能为空");
            return result;
        }

        User user = userService.getByName(phone);
        if (null == user) {
            result.setCode(502);
            result.setName("该用户不存在");
            return result;
        }
        Object codeRedis = redisTemplate.opsForValue().get(phone);
        if (!code.equals(codeRedis)) {
            result.setCode(503);
            result.setName("验证码输入错误");
            return result;
        }

        //验证通过---登录成功


        String token = JWT.create()
                .setPayload("name", phone)
                .setPayload("id", user.getId())
                .setKey(key)
                .sign();
        //如果登录成功
        result.setCode(200);
        result.setName("恭喜登录成功");
        result.setData(token);
        return result;
    }


    /**
     * 校验token是否正确，正确返回用户信息，否则返回错误码
     *
     * @param token
     * @return
     */
    @ResponseBody
    @RequestMapping("checkToken")
    public HouseResult checkToken(String token) {
        HouseResult result = new HouseResult();
        JWT jwt = JWT.of(token).setKey(key);
        boolean b = jwt.verify();
        if (b) {//校验通过
            result.setCode(200);
            result.setName("校验通过");
            Object name = jwt.getPayload("name");
            Object id = jwt.getPayload("id");
            /*User user = new User();
            user.setId(id.);*/
            result.setData(name.toString());
            return result;
        } else {
            result.setCode(500);
            result.setName("校验不通过,token已经失效，请重新登录");
            return result;
        }
    }
}
