package com.zh.servIet;

import com.zh.bean.Doctor;
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
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobby");
        String str = "";
        for (String hobby : hobbies) {
            str += hobby+",";
        }
        String sub = str.substring(0, str.length() - 1);
        String time = request.getParameter("time");
        String depName = request.getParameter("depName");
        AllDaoImp dao = new AllDaoImp();
        int i = dao.update(new Doctor(
                Integer.parseInt(id),
                name, gender, sub, time, depName
        ));
        response.getWriter().println(i);

    }
}