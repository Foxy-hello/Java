package com.bwie.interceptor;

import com.bwie.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user1 = (User)request.getSession().getAttribute("user1");

        if(user1!=null){
            return true;
        }
        response.sendRedirect("index.jsp");
        return false;
    }
}
