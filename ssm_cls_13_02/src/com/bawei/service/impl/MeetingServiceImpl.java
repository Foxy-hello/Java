package com.bawei.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MeetingDao;
import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;
import com.github.pagehelper.PageHelper;

@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingDao meetingDao;
	
	@Override
	public int addMeeting(Meeting meeting) {
		return meetingDao.add(meeting);
	}

	@Override
	public int deleteMeetingById(int... ids) {
		return meetingDao.deleteMeetingById(ids);
	}

	@Override
	public int updateMeetingById(Meeting meeting) {
		return meetingDao.updateMeetingById(meeting);
	}

	@Override
	public Meeting findMeetingById(int id) {
		return meetingDao.findMeetingById(id);
	}

	@Override
	public List<Meeting> findMeeting(Meeting meeting, int page, int rows) {
		PageHelper.startPage(page, rows);
		return meetingDao.findMeeting(meeting);
	}
}
