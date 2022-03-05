package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Update", value = "/Update")
public class Update extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("adminId");
        AdminDaoImp dao = new AdminDaoImp();
        Admin admin = dao.findID(Integer.parseInt(id));

        List<Admin> list = dao.findAll();
        request.setAttribute("admin",admin);
        request.setAttribute("list",list);
        request.getRequestDispatcher("Update.jsp").forward(request,response);



    }
}