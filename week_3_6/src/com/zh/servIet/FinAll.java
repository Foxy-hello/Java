package com.zh.servIet;

import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

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
        //调用JDBC展示所有学生
        UserDaoImp dao = new UserDaoImp();
        List<User> list = dao.findAll();
        //存值
        request.setAttribute("list",list);
        //转发到展示页面
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}