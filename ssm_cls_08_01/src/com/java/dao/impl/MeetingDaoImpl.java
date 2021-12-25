package com.bawei.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bawei.dao.MeetingDao;
import com.bawei.pojo.Meeting;

@Repository
public class MeetingDaoImpl implements MeetingDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Meeting> findMeeting(Meeting meeting) {
		List<Meeting> list = sqlSessionTemplate
				.selectList("com.bawei.dao.MeetingDao.findMeeting", meeting);
		return list;
	}

}
