package com.zh.servIet;

import com.zh.bean.User;
import com.zh.dao.UserDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserInsert", value = "/UserInsert")
public class UserInsert extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String mail = request.getParameter("mail");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        User user = new User(0,name,sex,new Integer(age),mail,phone,address);
        UserDaoImp dao = new UserDaoImp();
        int i = dao.insert(user);
        if (i > 0){
            request.getRequestDispatcher("yes.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("error.jsp").forward(request,response);

        }
    }
}