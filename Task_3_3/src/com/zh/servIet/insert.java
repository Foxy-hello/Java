package com.zh.servIet;

import com.zh.bean.Admin;
import com.zh.dao.AdminDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "insert", value = "/insert")
public class insert extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sa = request.getParameter("sa");
        if (sa.equals("取消")){
            request.getRequestDispatcher("insert.jsp").forward(request,response);
        }else{
            String admin = request.getParameter("admin");
            String pwd = request.getParameter("pwd");
            AdminDaoImp dao = new AdminDaoImp();
            int in = dao.insert(new Admin(0, admin, pwd));
            if (in > 0){
                request.getRequestDispatcher("yes.jsp").forward(request,response);
            }else{
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }

    }
}