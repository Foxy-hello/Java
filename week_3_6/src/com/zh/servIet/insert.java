package com.zh.servIet;

import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "insert", value = "/insert")
public class insert extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String mail = request.getParameter("mail");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        //调用JDBC添加
        UserDaoImp dao = new UserDaoImp();
        dao.insert(new User(0,name,sex,Integer.parseInt(age),mail,phone,address));
        //转发到展示页面
        request.getRequestDispatcher("FinAll").forward(request,response);
    }
}