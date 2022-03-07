package com.zh.servIet;

import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindByID", value = "/FindByID")
public class FindByID extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        //调用JDBC
        UserDaoImp dao = new UserDaoImp();
        User byId = dao.findById(Integer.parseInt(id));
        //存值
        request.setAttribute("byId",byId);
        //转发
        request.getRequestDispatcher("byId.jsp").forward(request,response);
    }
}