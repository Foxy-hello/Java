package com.java.servIet;

import com.java.bean.User;
import com.java.dao.UserImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServIet", value = "/UserServIet")
public class UserServIet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String psw = request.getParameter("psw");
        //调用JDBC
        UserImp us = new UserImp();
        User log = us.login(name, psw);
        if (log != null){
            request.getRequestDispatcher("yes.jsp").forward( request,response);
        }else{
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}