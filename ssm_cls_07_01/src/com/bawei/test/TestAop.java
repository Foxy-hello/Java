package com.bawei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;
import com.bawei.service.impl.MeetingServiceImpl;

public class TestAop {
	@Test
	public void test01(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring_context.xml");
		MeetingService msi=(MeetingService) ac.getBean("meetingServiceImpl");
		Meeting meet=new Meeting("IT互联网大会");
		msi.addMeeting(meet);
		
//		msi.deleteMeeting(1);
//		
//		msi.updateMeeting(meet);
//		
//		msi.findMeetingAll();
	}
}
