package com.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MeetingDao;
import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;
import com.github.pagehelper.PageHelper;

@Service
public class MeetingServiceImpl implements MeetingService{
	@Autowired
	private MeetingDao meetingDao;
	


	@Override
	public int addMeeting(Meeting meet) {
		return meetingDao.addMeeting(meet);
	}
}
