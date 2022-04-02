package com.zh.servIet;

import com.zh.bean.Doctor;
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
        String gender = request.getParameter("gender");
        String hobby = "";
        for (String par : request.getParameterValues("hobby")) {
            hobby += (par+",");
        }
        String sub = hobby.substring(0, hobby.length() - 1);
        String time = request.getParameter("time");
        String depName = request.getParameter("depName");
        AllDaoImp dao = new AllDaoImp();
        int i = dao.addDoc(new Doctor(
                0, name, gender, sub, time, depName
        ));
        response.getWriter().println(i);

    }
}