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

@WebServlet(name = "byUpdate", value = "/byUpdate")
public class byUpdate extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("sid");
        AllDaoImp dao = new AllDaoImp();
        Hotel Ho = dao.findByHo(Integer.parseInt(sid));
        request.setAttribute("ho",Ho);
        List<Cuisine> byCui = dao.findByCui();
        request.setAttribute("by",byCui);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }
}