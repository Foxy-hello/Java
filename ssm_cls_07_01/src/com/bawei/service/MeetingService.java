package com.bawei.service;

import com.bawei.pojo.Meeting;

public interface MeetingService {
	public void addMeeting(Meeting meet);
    public void updateMeeting(Meeting meet);
    public void deleteMeeting(int meetId);
    public void findMeetingAll();
}
