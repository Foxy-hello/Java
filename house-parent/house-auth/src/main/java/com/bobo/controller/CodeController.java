package com.bobo.controller;

import cn.hutool.captcha.generator.RandomGenerator;
import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSON;
import com.bobo.pojo.HouseResult;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/6/9 16:47
 */
@CrossOrigin
@Controller
public class CodeController {
    @Autowired
    RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping("sendCode")
    public Object sendCode(String phone) throws Exception {
        String apiUrl="https://sms_developer.zhenzikj.com";
        String appId="110630";
        String appSecret="ZmI1Yjc0ZTUtODE4Ny00ZjIwLTg2YjQtNDI0MDFjZDljMTZl";
        ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("number", phone);
        params.put("templateId", "7739");
        String[] templateParams = new String[2];
        RandomGenerator randomUtil = new RandomGenerator("1234567890",4);
        String code = randomUtil.generate();

        templateParams[0] = code;
        templateParams[1] = "5分钟";
        params.put("templateParams", templateParams);
        String result = client.send(params);//发短信--手机一份
        redisTemplate.opsForValue().set(phone,code,5, TimeUnit.MINUTES);//reids 存一份
       return  JSON.parseObject(result);
    }
}
