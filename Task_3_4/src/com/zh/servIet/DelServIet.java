package com.zh.servIet;

import com.zh.dao.AdminDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelServIet", value = "/DelServIet")
public class DelServIet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("adminId");
        AdminDaoImp dao = new AdminDaoImp();
        int del = dao.del(Integer.parseInt(id));
        //转发
        request.getRequestDispatcher("FinAll").forward(request,response);
    }
}