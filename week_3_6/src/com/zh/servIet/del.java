package com.zh.servIet;

import com.zh.dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "del", value = "/del")
public class del extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        //调用JDBC
        UserDaoImp dao = new UserDaoImp();
        dao.del(Integer.parseInt(id));
        //转发到展示页面
        request.getRequestDispatcher("FinAll").forward(request,response);
    }
}