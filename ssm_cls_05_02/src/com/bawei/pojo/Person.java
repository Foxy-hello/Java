package com.bawei.pojo;

public class Person {
	private String name;//姓名
	private char sex;//性别
	private int age;//年龄
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		System.out.println("执行了无参构造器!!!");
	}
	
	public Person(String name, char sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

}
