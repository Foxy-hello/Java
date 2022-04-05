package com.zh.servIet;

import com.zh.bean.T_food;
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
        String price = request.getParameter("price");
        String time = request.getParameter("time");
        String content = request.getParameter("content");
        String tid = request.getParameter("tid");
        AllDaoImp dao = new AllDaoImp();
        int i = dao.addFood(new T_food(
                0, name, Double.parseDouble(price),
                time, content, Integer.parseInt(tid), ""
        ));
        response.getWriter().println(i);
    }
}