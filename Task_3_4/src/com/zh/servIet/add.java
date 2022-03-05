package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "add", value = "/add")
public class add extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminName = request.getParameter("adminName");
        String adminPwd = request.getParameter("adminPwd");
        AdminDaoImp dao = new AdminDaoImp();
        dao.add(new Admin(0,adminName,adminPwd));
        //重新转发查询数据库
        request.getRequestDispatcher("FinAll").forward(request,response);
    }
}