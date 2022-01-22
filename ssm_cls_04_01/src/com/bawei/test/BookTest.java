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
	 * 测试if标签实现多条件查询
	 */
	@Test
	public void selectBycondition() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			Book book = new Book();
			book.setbName("狮子王");
			book.setbPublisher("人民教育出版社");
			book.setbAuthor("张三");
			ArrayList<Book> books  = sqlSession.getMapper(BookDao.class).selectBycondition(book);
			for(Book b:books){
				System.out.println(b);
			}
			System.out.println("searchBook-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试按照指定的id集合查询图书
	 */
	@Test
	public void selectByIdsList() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			ArrayList<Integer> ids = new ArrayList<Integer>();
			ids.add(1);
			ids.add(2);
			ids.add(3);
			ArrayList<Book> books = sqlSession.getMapper(BookDao.class).selectByIdsList(ids);
			for(Book book:books){
				System.out.println(book);
			}
			System.out.println("selectByIdsList-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试按照指定的id数组查询图书
	 */
	@Test
	public void selectByIdsArray() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			int[] ids = new int[]{1,3,5,7,9,11};
			ArrayList<Book> books = sqlSession.getMapper(BookDao.class).selectByIdsArray(ids);
			for(Book book:books){
				System.out.println(book);
			}
			System.out.println("selectByIdsArray-------------end");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试按照指定的id Map查询图书
	 */
	@Test
	public void selectByIdsMap() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			List ids = new ArrayList();
	        ids.add(1);
	        ids.add(2);
	        ids.add(3);
	        Map params = new HashMap();
	        params.put("ids", ids);
	        params.put("title", "科技");
			ArrayList<Book> books = sqlSession.getMapper(BookDao.class).selectByIdsMap(params);
			for(Book book:books){
				System.out.println(book);
			}
			System.out.println("selectByIdsMap-------------end");
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
	public void updateBook() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			Book book = new Book();
			book.setbId(13); 
			book.setbAuthor("王五");
			book.setbDetail("小说");
			book.setbName("唐诗");
			book.setbPrice(33.9);
			book.setbPubdate("1911-1-1");
			int i = sqlSession.getMapper(BookDao.class).updateBook(book);
			 
			System.out.println("updateBook-------------end"+i);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试多个条件查询
	 */
	@Test
	public void selectByIdAndName() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			Book b = sqlSession.getMapper(BookDao.class).selectByIdAndName(0,"小猪佩奇");
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 测试批量增加图书方法
	 */
	@Test
	public void insertBookBatch() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			ArrayList<Book> list1 = new ArrayList<Book>();
			Book book = new Book();
			book.setbId(23); book.setbAuthor("张三");book.setbDetail("小说");book.setbName("狮子王");
			book.setbPrice(23.3);book.setbPubdate("2000-1-1");book.setbPublisher("人民教育出版社");
			list1.add(book);
			Book book1 = new Book();
			book1.setbId(24); book1.setbAuthor("李四");book1.setbDetail("小说");book1.setbName("猫和老鼠");
			book1.setbPrice(43.3);book1.setbPubdate("1911-1-1");book1.setbPublisher("北大出版社");
			list1.add(book1);
			Book book2 = new Book();
			book2.setbId(25); book2.setbAuthor("王五");book2.setbDetail("小说");book2.setbName("小猪佩奇");
			book2.setbPrice(53.3);book2.setbPubdate("2010-1-1");book2.setbPublisher("清华出版社");
			list1.add(book2);
			sqlSession.getMapper(BookDao.class).insertBookBatch(list1);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	
	/**
	 * 测试批量删除
	 */
	@Test
	public void deleteBookBatch() {
		SqlSession sqlSession = null;
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			int[] bookids = new int[]{2,3,4};
			sqlSession.getMapper(BookDao.class).deleteBookBatch(bookids);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
	}
	
	
}
