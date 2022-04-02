package com.zh.servIet;

import com.alibaba.fastjson.JSON;
import com.zh.bean.Doctor;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DocById", value = "/DocById")
public class DocById extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        AllDaoImp dao = new AllDaoImp();
        Doctor doc = dao.byId(Integer.parseInt(id));
        String s = JSON.toJSONString(doc);
        response.getWriter().println(s);
    }
}