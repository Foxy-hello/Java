package com.bawei.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.bawei.pojo.Book;

public interface BookDao {
	 public Book selectById(int id);
	 /**
	  * 使用if标签实现多条件查询
	  * @param book  封装图书条件
	  * @return
	  */
	 public ArrayList<Book> selectBycondition(Book book);
	 /**
	  * 按照指定的id集合查询图书
	  * @param ids
	  * @return
	  */
	 public ArrayList<Book> selectByIdsList(List ids);
	 /**
	  * 按照指定的id数组查询图书
	  * @param ids
	  * @return
	  */
	 public ArrayList<Book> selectByIdsArray(int[] ids);
	 /**
	  * 按照指定的id Map查询图书
	  * @param ids
	  * @return
	  */
	 public ArrayList<Book> selectByIdsMap(Map ids);
	 /**
	  * 修改图书
	  * @param book
	  * @return
	  */
	 public int updateBook(Book book);
	 /**
	  * 批量增加
	  * @param list1
	  */
	 public void insertBookBatch(List list1);
	 /**
	  * 批量删除
	  * @param bookids
	  */
	 public void deleteBookBatch(int[] bookids);
	 /**
	  * 多个条件查询
	  * @param bId 图书id
	  * @param bName 图书名称
	  * @return
	  */
	 public Book selectByIdAndName(@Param("bId")Integer bId,@Param("bName")String bName);
}
