package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

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
        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");
        Admin admin = new Admin(0, adminName, adminPwd);
        AdminDaoImp dao = new AdminDaoImp();
        Admin login = dao.login(admin);
        if (login != null){
            //存值，去查询所有
            request.setAttribute("admin",admin);
            request.getRequestDispatcher("FinAll").forward(request,response);
        }else{
            request.setAttribute("no","用户名或者密码错误");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}