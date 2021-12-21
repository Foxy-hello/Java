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
		//meeting.setMeetingName("开发");
		//meeting.setState(1);
		//meeting.setStartTime("2019-04-07");
		//meeting.setEndTime("2019-05-15");
		
		List<Meeting> list = ms.findMeeting(meeting);
		System.out.println("会议编号\t会议名称\t\t开始时间\t\t结束时间\t\t城市\t状态");
		for (Meeting m : list) {
			System.out.println(m.getId()+"\t"+m.getMeetingName()+"\t"+m.getStartTime()+"\t"+m.getEndTime()+"\t"+m.getCityId()+"\t"+m.getState());
		}
	}
	
	
	/**
	 * 测试新增功能
	 */
	@Test
	public void addTest(){
		Meeting meeting=new Meeting();
		meeting.setMeetingName("2019年IT产品大会");
		meeting.setStartTime("2019-7-29");
		meeting.setEndTime("2019-7-31");
		meeting.setProvinceId(1);
		meeting.setCityId(4);
		meeting.setCountyId(9);
		meeting.setAddress("河北石家庄");
		meeting.setContact("张华");
		meeting.setTelephone("0311-80755957");
		meeting.setMobilephone("13721879236");
		meeting.setIntroduce("IT产品发布");
		meeting.setImage("it.jpg");
		meeting.setState(0);
		ms.add(meeting);
	}
	
	/**
	 * 测试删除功能
	 */
	@Test
	public void deleteTest(){
		//根据id删除单个
		//ms.deleteMeetingById(1);
		int[] ids = {1,3,5};
		ms.deleteMeetingById(ids);
	}
	
	/**
	 * 测试修改功能
	 */
	@Test
	public void updateTest(){
		Meeting meeting = ms.findMeetingById(2);
		meeting.setMeetingName("Java新技术讲座");
		ms.updateMeetingById(meeting);
		
	}
	
}
