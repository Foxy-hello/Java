package com.zh.utils;

import com.zhenzi.sms.ZhenziSmsClient;

import java.util.HashMap;

public class ZhenZiYun {

    private static final String AppUrl = "https://sms_developer.zhenzikj.com";
    private static final String AppId = "111702";
    private static final String AppSecret = "896fa189-379f-4326-8ce8-ee06fc556c3e";
    private static final String TemplateId = "9547";
    private static final ZhenziSmsClient zhenziSmsClient = new ZhenziSmsClient(AppUrl,AppId,AppSecret);

    public static String send(String phone,String... args){
        HashMap<String, Object> params = new HashMap<>();
        params.put("number",phone);
        params.put("templateId",TemplateId);
        params.put("templateParams",args);
        String res = null;
        try {
             res = zhenziSmsClient.send(params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
