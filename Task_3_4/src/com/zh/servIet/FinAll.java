package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FinAll", value = "/FinAll")
public class FinAll extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminDaoImp dao = new AdminDaoImp();
        List<Admin> list = dao.findAll();
        //存值
        request.setAttribute("list",list);
        //转发页面
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}