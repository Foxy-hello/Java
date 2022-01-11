package com.bawei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bawei.pojo.Person;

public class PersonTest {
	@Test
	public void testPerson(){
		 // 1 创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
		// 2 向容器"要"onePerson对象
		Person person = (Person) ac.getBean("onePerson");
		// 3 调用person对象的sayHi()
		person.sayHi();
	}
}
