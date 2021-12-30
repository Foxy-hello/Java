package com.bawei.dao.impl;

import org.springframework.stereotype.Repository;

import com.bawei.dao.MeetingDao;
import com.bawei.pojo.Meeting;

@Repository
public class MeetingDaoImpl implements MeetingDao{

	@Override
	public void addMeeting(Meeting meet) {
		System.out.println("正在执行新增"+meet.getMeetingName()+"会议操作");
	}

	@Override
	public void updateMeeting(Meeting meet) {
		System.out.println("正在执行修改"+meet.getMeetingName()+"会议操作");
	}

	@Override
	public void deleteMeeting(int meetId) {
		System.out.println("正在执行删除"+meetId+"会议操作");
	}

	@Override
	public void findMeetingAll() {
		System.out.println("正在执行查询会议操作");
	}

}
