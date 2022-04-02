package com.zh.servIet;

import com.zh.bean.Game;
import com.zh.dao.AllDaoImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindGame", value = "/FindGame")
public class FindGame extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AllDaoImp dao = new AllDaoImp();
        List<Game> gameList = dao.findGame();
        request.setAttribute("game",gameList);
        request.getRequestDispatcher("showGame.jsp").forward(request,response);
    }
}