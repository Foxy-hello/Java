package com.zh.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebListener
public class MyListen implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent sce) {
        //销毁方法yyyy-MM-dd hh:mm:ss
        System.out.println("服务器被销毁");
        Date date = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sim.format(date);
        System.out.println(format);

    }

    public void contextInitialized(ServletContextEvent sce) {
        //初始化方法yyyy-MM-dd hh:mm:ss
        System.out.println("服务器被创建");
        Date date = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sim.format(date);
        System.out.println(format);
    }
}