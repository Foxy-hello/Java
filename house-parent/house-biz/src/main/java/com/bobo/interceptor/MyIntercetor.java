package com.bobo.interceptor;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bobo.pojo.HouseResult;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @description:
 * @author: BOBO
 * @time: 2022/6/9 17:08
 */
public class MyIntercetor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        /**
         * (2)编写拦截器，读取Cookie信息，验证token是否正确（5分）
         * (3)校验token，需使用HttpClient（hutool）调用认证服务，正确返回用户信息，错误跳转登录页面。（5分）
         */

        Cookie[] cookies = request.getCookies();
        if(null!=cookies&&cookies.length>0){
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("login_token")){
                    String token = cookie.getValue();
                    String s = HttpUtil.get("http://127.0.0.1:81/auth/checkToken?token=" + token);
                    HouseResult houseResult = JSON.parseObject(s,HouseResult.class);

                    if( houseResult.getCode()==200){
                        request.setAttribute("name",houseResult.getData());//把当前登录人的信息，存入request
                        return true;//校验通过，放行
                    }
                    break;
                }

            }
        }
        response.sendRedirect("/toLogin");//校验失败，跳转到登录页面

        return false;
    }
}
