package com.bawei.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory factory;

	static{
		try {
			InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
			factory=new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSession createSqlSession(){
		return factory.openSession(true);
	}
	
	public static void closeSqlSession(SqlSession sqlSession){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
	public static void main(String[] args) {
		SqlSession ss=MyBatisUtil.createSqlSession();
		System.out.println(ss);
	}
}
