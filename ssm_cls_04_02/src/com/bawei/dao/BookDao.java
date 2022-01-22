package com.bawei.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bawei.pojo.Book;

public interface BookDao {
	 @Select("select * from book")
	 public ArrayList<Book> selectAllBook();
	 
	 @Insert("INSERT INTO book(bName,bAuthor,bPubdate,bPrice,bPublisher,bDetail) VALUES" +
	 "(#{bName},#{bAuthor},#{bPubdate},#{bPrice},#{bPublisher},#{bDetail})")
	 public	void addBook(Book book);
	 @Update("update book set bName=#{bName},bAuthor=#{bAuthor},bPubdate=#{bPubdate}, " +
     "bPrice=#{bPrice},bPublisher=#{bPublisher},bDetail=#{bDetail} where bId=#{bId}")
	 public	void modifyBook(Book book);
	 @Delete("delete from book where bid=#{bid}")
	 public void deleteBook(int bId);
	 @Select("select * from book where bName = #{bName1} and bAuthor = #{bAuthor1}")
	 public ArrayList<Book> selectBookByBnameAndBauthor(@Param("bName1")String bName,@Param("bAuthor1")String bAuthor);
}
