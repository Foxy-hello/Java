package com.bawei.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bawei.pojo.Person;

public class PersonTest {
	/*
	 * 测试构造方法设置值
	 */
	@Test
	public void testPerson01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
		Person person = (Person) ac.getBean("constructorPerson");
		System.out.println("姓名:"+person.getName()+",性别:"+person.getSex());
	}
	
	/*
	 * 测试p名称空间设置值
	 */
	@Test
	public void testPerson02(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
		Person person = (Person) ac.getBean("pPerson");
		System.out.println("姓名:"+person.getName()+",性别:"+person.getSex()+",年龄:"+person.getAge());
	}
}
