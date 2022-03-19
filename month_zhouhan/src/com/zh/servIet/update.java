package com.zh.servIet;

import com.zh.bean.Hotel;
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
        String description = request.getParameter("description");
        String time = request.getParameter("time");
        String state = request.getParameter("state");
        String cid = request.getParameter("cid");
        AllDaoImp dao = new AllDaoImp();
        dao.update(new Hotel(
                Integer.parseInt(id),
                Integer.parseInt(cid),
                name,description,time,
                Integer.parseInt(state),"",""
        ));
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}