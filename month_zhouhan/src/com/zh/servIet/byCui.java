package com.zh.servIet;

import com.zh.bean.Cuisine;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "byCui", value = "/byCui")
public class byCui extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AllDaoImp dao = new AllDaoImp();
        List<Cuisine> byCui = dao.findByCui();
        request.setAttribute("by",byCui);
        request.getRequestDispatcher("add.jsp").forward(request,response);
    }
}