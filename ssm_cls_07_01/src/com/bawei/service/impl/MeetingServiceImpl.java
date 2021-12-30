package com.bawei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MeetingDao;
import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService{
	@Autowired
	private MeetingDao meetingDao;
	
	@Override	
	public void addMeeting(Meeting meet) {
		meetingDao.addMeeting(meet);
	}

	@Override
	public void updateMeeting(Meeting meet) {
		meetingDao.updateMeeting(meet);
	}

	@Override
	public void deleteMeeting(int meetId) {
		meetingDao.deleteMeeting(meetId);
	}

	@Override
	public void findMeetingAll() {
		meetingDao.findMeetingAll();
	}

}
