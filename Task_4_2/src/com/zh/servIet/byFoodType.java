package com.zh.servIet;

import com.alibaba.fastjson.JSON;
import com.zh.bean.T_type;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "byFoodType", value = "/byFoodType")
public class byFoodType extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AllDaoImp dao = new AllDaoImp();
        List<T_type> list = dao.findType();
        String s = JSON.toJSONString(list);
        response.getWriter().println(s);
    }
}