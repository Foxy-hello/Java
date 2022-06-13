package com.zh.utils;


import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;

public class GitUtils {

    private static final String CLIENTID =
            "f14e1029cfedd25e71777fc18d9c0b4343da144b5e10c615a88f3a42ae7d6a63";

    private static final String CLIENTSECRET =
            "5d68af69bdc67fdb3cfd7fe369ced63233277b2f4ef659f409e3e9bb8f952dd4";

    private static final String CALLBACK =
            "http://localhost:8084/callback";

    public static String authorize(){
        return "https://gitee.com/oauth/authorize?client_id="+CLIENTID+"&redirect_uri="+CALLBACK+"&response_type=code";
    }

    public static String Token(String code){
        return "https://gitee.com/oauth/token?grant_type=authorization_code&code="+code+"&client_id="+CLIENTID+"&redirect_uri="+CALLBACK+"&client_secret="+CLIENTSECRET;
    }

    public static String User(String token){
        return " https://gitee.com/api/v5/user?access_token="+token;
    }

    public static String getUserInfoByCode(String token){
        String user = Token(token);
        String jsonObj = HttpUtil.post(user, "");
        JSONObject jsonObject = new JSONObject(jsonObj);
        String access_token = jsonObject.getStr("access_token");
        return HttpUtil.get(User(access_token));
    }



}
