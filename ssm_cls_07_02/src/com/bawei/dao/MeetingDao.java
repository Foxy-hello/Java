package com.bawei.dao;

import com.bawei.pojo.Meeting;

public interface MeetingDao {
	public void addMeeting(Meeting meet);
    public void updateMeeting(Meeting meet);
    public void deleteMeeting(int meetId);
    public void findMeetingAll();
}
