package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "newUp", value = "/newUp")
public class newUp extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminName = request.getParameter("adminName");
        String adminId = request.getParameter("adminId");
        String adminPwd = request.getParameter("adminPwd");
        Admin admin = new Admin(new Integer(adminId), adminName, adminPwd);
        AdminDaoImp dao = new AdminDaoImp();
        dao.update(admin);
        request.getRequestDispatcher("show").forward(request,response);
    }
}