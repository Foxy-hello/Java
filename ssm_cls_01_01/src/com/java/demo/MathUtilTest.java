package com.bawei.demo;

import org.junit.Before;
import org.junit.Test;
/*
 * 演示JUnit-基本注解
 */
public class MathUtilTest {
	int a;
	int b;
	
	//所有方法执行前都要执行一次
	@Before
	public void before(){
		a=20;
		b=10;
	}
	
	//测试MathUtil加的方法
	@Test
	public void testAdd(){
		int result=MathUtil.add(a, b);
		System.out.println("两个数的和是:"+result);
	}
	
	//测试MathUtil减的方法
	@Test
	public void testMinus(){
		int result=MathUtil.minus(a, b);
		System.out.println("两个数的差是:"+result);
	}
}
