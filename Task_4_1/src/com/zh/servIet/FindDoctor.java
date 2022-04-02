package com.zh.servIet;

import com.zh.bean.Doctor;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindDoctor", value = "/FindDoctor")
public class FindDoctor extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AllDaoImp dao = new AllDaoImp();
        List<Doctor> list = dao.findAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("showDoc.jsp").forward(request,response);
    }
}