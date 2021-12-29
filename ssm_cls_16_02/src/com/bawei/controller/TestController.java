package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test1")
	public void test01(){
		System.out.println("测试数据");
	}
	
	@RequestMapping("test2")
	public void test02(){
		System.out.println("测试数据");
	}
}
