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

@WebServlet(name = "fuzzy", value = "/fuzzy")
public class fuzzy extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cid = request.getParameter("cid");
        AllDaoImp dao = new AllDaoImp();
        List<Hotel> list = dao.fuzzy(name, cid);
        List<Cuisine> byCui = dao.findByCui();
        request.setAttribute("by",byCui);
        request.setAttribute("name",name);
        request.setAttribute("cid",cid);
        request.setAttribute("list",list);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}