package com.zh.servIet;

import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "del", value = "/del")
public class del extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("sid");
        AllDaoImp dao = new AllDaoImp();
        dao.del(Integer.parseInt(sid));
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}