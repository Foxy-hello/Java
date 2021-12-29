package com.bawei.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定义拦截器
 */
public class FristIntercepter implements HandlerInterceptor{
	/*
	  整个请求结束之后被调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e)
			throws Exception {
		System.out.println("------FristIntercepter----afterCompletion-----");
	}
	/*
	处理器中的处理器请求方方法执行完成之后视图渲染之前被调用 
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mv)
			throws Exception {
		System.out.println("------FristIntercepter----postHandle-----");
	}
	
	/*
	 处理器处理请求之前被调用   执行处理器方法之前的准备工作
	 返回值boolean类型 true表示调用下一个方法  false表示请求结束
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		System.out.println("------FristIntercepter----preHandle-----");
		return true;
	}
}






