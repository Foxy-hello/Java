package com.bawei.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bawei.pojo.Guest;
import com.bawei.pojo.Meeting;
import com.bawei.service.GuestService;

public class GuestTest {
	
	private GuestService gs;
	
	@Before
	public void setUp(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		gs = (GuestService) context.getBean("guestServiceImpl");
	}
	
	/**
	 * 测试查询功能
	 * 按条件查询嘉宾信息，
	 */
	@Test
	public void findGuestTest(){
		Map<String, Object> map = new HashMap<>();
		map.put("guestName", "王");
		map.put("meetingName", "开发者");
		List<Guest> list = gs.findGuest(map);
		for (Guest g : list) {
			System.out.println(g.getId()+"\t"+g.getGuestName()+"\t"+
					g.getTelephone()+"\t"+g.getEmail()+"\t"+
					g.getCompany()+"\t"+g.getDept()+"\t"+g.getDuty());
			for (Meeting m : g.getMeetings()) {
				System.out.println("=====>  "+m.getId()+"\t"+m.getMeetingName()+"\t"+m.getStartTime()+"\t"+m.getEndTime());
			}
		}
	}
	
	@Test
	public void findGuestJoinTest(){
		Map<String, Object> map = new HashMap<>();
		map.put("guestName", "王");
		map.put("meetingName", "开发者");
		List<Map<String,Object>> list = gs.findGuestJoin(map);
		System.out.println();
		for (Map<String,Object> g : list) {
			System.out.println(g.get("gid")+"\t"+g.get("guestName")+"\t"+
					g.get("gtel")+"\t"+g.get("email")+"\t"+
					g.get("company")+"\t"+g.get("dept")+"\t"+g.get("duty"));
			String[] mids = ((String) g.get("mid")).split(",");
			String[] meetingNames = ((String) g.get("meetingName")).split(",");
			String[] startTimes = ((String) g.get("startTime")).split(",");
			String[] endTimes = ((String) g.get("endTime")).split(",");
			for (int i = 0; i < mids.length; i++) {
				System.out.println("=====>  "+mids[i]+"\t"+meetingNames[i]+"\t"+startTimes[i]+"\t"+endTimes[i]);
			}
		}
	}	
}
