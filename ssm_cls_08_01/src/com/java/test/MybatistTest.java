package com.bawei.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;

public class MybatistTest {
	
	private MeetingService ms;
	
	@Before
	public void setUp(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		ms = (MeetingService) context.getBean("meetingServiceImpl");
	}
	
	/**
	 * 测试查询功能
	 */
	@Test
	public void findMeetingTest(){
		Meeting meeting = new Meeting();
		//meeting.setId(1);
		meeting.setMeetingName("开发");
		//meeting.setState(1);
		//meeting.setStartTime("2019-04-07");
		//meeting.setEndTime("2019-05-15");
		
		List<Meeting> list = ms.findMeeting(meeting);
		System.out.println("会议编号\t会议名称\t\t开始时间\t\t结束时间\t\t城市\t状态");
		for (Meeting m : list) {
			System.out.println(m.getId()+"\t"+m.getMeetingName()+"\t"+m.getStartTime()+"\t"+m.getEndTime()+"\t"+m.getCityId()+"\t"+m.getState());
		}
	}
	
	
	
}
