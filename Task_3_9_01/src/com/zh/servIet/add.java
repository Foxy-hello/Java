package com.zh.servIet;

import com.zh.baan.Stu;
import com.zh.dao.AllDaoImp;

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
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String happy = request.getParameter("happy");
        String time = request.getParameter("time");
        String cid = request.getParameter("cid");
        AllDaoImp dao = new AllDaoImp();
        Stu stu = new Stu(0, name, sex, Integer.parseInt(age), happy, time, Integer.parseInt(cid), "");
        dao.insert(stu);
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}