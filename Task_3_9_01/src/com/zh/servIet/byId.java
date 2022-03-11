package com.zh.servIet;

import com.zh.baan.Cls;
import com.zh.baan.Stu;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "byId", value = "/byId")
public class byId extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("sid");
        AllDaoImp dao = new AllDaoImp();
        List<Cls> cls = dao.findCls();
        Stu stu = dao.findById(Integer.parseInt(sid));
        request.setAttribute("stu",stu);
        request.setAttribute("cls",cls);
        request.getRequestDispatcher("update.jsp").forward(request,response);

    }
}