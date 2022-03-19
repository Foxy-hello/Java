package com.zh.servIet;

import com.zh.bean.Hotel;
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
        String description = request.getParameter("description");
        String time = request.getParameter("time");
        String state = request.getParameter("state");
        String cid = request.getParameter("cid");
        AllDaoImp dao = new AllDaoImp();
        dao.add(new Hotel(
                0,Integer.parseInt(cid),name,description,time,Integer.parseInt(state),"",""
        ));
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}