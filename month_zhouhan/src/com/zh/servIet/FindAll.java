package com.zh.servIet;

import com.zh.bean.Cuisine;
import com.zh.bean.Hotel;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindAll", value = "/FindAll")
public class FindAll extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AllDaoImp dao = new AllDaoImp();
        List<Hotel> list = dao.findAll();
        request.setAttribute("list",list);
        List<Cuisine> byCui = dao.findByCui();
        request.setAttribute("by",byCui);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}