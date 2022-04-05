package com.zh.servIet;

import com.zh.bean.T_food;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Fuzzy", value = "/Fuzzy")
public class Fuzzy extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        AllDaoImp dao = new AllDaoImp();
        List<T_food> list = dao.fuzzy(name, start, end);
        request.setAttribute("list",list);
        request.setAttribute("name",name);
        request.setAttribute("start",start);
        request.setAttribute("end",end);
        request.getRequestDispatcher("showFoods.jsp").forward(request,response);
    }
}