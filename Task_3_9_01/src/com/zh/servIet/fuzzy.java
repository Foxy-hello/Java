package com.zh.servIet;

import com.zh.baan.Stu;
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
        String stats = request.getParameter("stats");
        String end = request.getParameter("end");
        String cid = request.getParameter("cid");
        AllDaoImp dao = new AllDaoImp();
        List<Stu> list = dao.fuzzy(name, stats, end, cid);
        request.setAttribute("list",list);
        request.setAttribute("name",name);
        request.setAttribute("stats",stats);
        request.setAttribute("end",end);
        request.setAttribute("cid",cid);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }
}