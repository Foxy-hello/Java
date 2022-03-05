package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServIet", value = "/loginServIet")
public class loginServIet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取值
        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");
        //调用JDBC的登录方法
        UserDaoImp dao = new UserDaoImp();
        Admin admin = dao.login(new Admin(0, adminName, adminPwd));
        if (admin != null){
            request.getRequestDispatcher("FinAll").forward(request,response);
        }else{
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}