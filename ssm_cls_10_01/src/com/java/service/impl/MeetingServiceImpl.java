package com.bawei.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MeetingDao;
import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingDao meetingDao;
	
	@Override
	public List<Meeting> findMeeting(Meeting meeting) {
		return meetingDao.findMeeting(meeting);
	}
	
	
}
