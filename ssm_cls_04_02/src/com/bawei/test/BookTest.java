package com.bawei.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.bawei.dao.BookDao;
import com.bawei.pojo.Book;
import com.bawei.util.MyBatisUtil;

public class BookTest {
	/**
	 * 测试查询所有图书
	 */
	@Test
	public void selectAllBook() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			ArrayList<Book> books = sqlSession.getMapper(BookDao.class).selectAllBook();
			for(Book book:books){
				System.out.println(book);
			}
			System.out.println("selectAllBook-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试添加图书
	 */
	@Test
	public void addBook() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			Book book = new Book();
			book.setbAuthor("张三");book.setbDetail("小说");book.setbName("狮子王");
			book.setbPrice(23.3);book.setbPubdate("2000-1-1");book.setbPublisher("人民教育出版社");
			sqlSession.getMapper(BookDao.class).addBook(book);
			System.out.println("addBook-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试修改图书
	 */
	@Test
	public void modifyBook() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			Book book = new Book();
			book.setbId(33);book.setbAuthor("张四");book.setbDetail("儿童小说");book.setbName("狮子王1");
			book.setbPrice(25.0);book.setbPubdate("2000-8-1");book.setbPublisher("北大出版社");
			sqlSession.getMapper(BookDao.class).modifyBook(book);
			System.out.println("modifyBook-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		
	}
	/**
	 * 测试删除图书
	 */
	@Test
	public void deleteBook() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			sqlSession.getMapper(BookDao.class).deleteBook(27);
			System.out.println("deleteBook-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		
	}
	/**
	 * 测试条件查询图书
	 */
	@Test
	public void selectBookByBnameAndBauthor() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			ArrayList<Book> books = sqlSession.getMapper(BookDao.class).selectBookByBnameAndBauthor("蓝血人","张三");
			for(Book book:books){
				System.out.println(book);
			}
			System.out.println("selectBookByBnameAndBauthor-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	
}
