package com.zh.servIet;

import com.zh.baan.Stu;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "update", value = "/update")
public class update extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("sid");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String happy = request.getParameter("happy");
        String time = request.getParameter("time");
        String cid = request.getParameter("cid");
        AllDaoImp dao = new AllDaoImp();
        dao.update(new Stu(
                Integer.parseInt(sid),
                name,sex,
                Integer.parseInt(age),
                happy,time,
                Integer.parseInt(cid),""
        ));
        request.getRequestDispatcher("FindAll").forward(request,response);

    }
}