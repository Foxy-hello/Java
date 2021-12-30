package com.bawei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bawei.service.UserDetailService;

public class TestSpring {
	@Test
    public void initContainerSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_context.xml");
		UserDetailService uds=(UserDetailService) ctx.getBean("userService");
		uds.testMethod();
    }

}
