package com.zh.servIet;

import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "byState", value = "/byState")
public class byState extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("sid");
        String state = request.getParameter("state");
        if (state.equals("1")){
            state="0";
        }else{
            state="1";
        }
        AllDaoImp dao = new AllDaoImp();
        dao.upState(Integer.parseInt(sid),Integer.parseInt(state));
        request.getRequestDispatcher("FindAll").forward(request,response);
    }
}