package com.bawei.test;

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
		Guest guest = new Guest();
		guest.setGuestName("王");
		List<Guest> list = gs.findGuest(guest);
		for (Guest g : list) {
			System.out.println(g.getId()+"\t"+g.getGuestName()+"\t"+
					g.getTelephone()+"\t"+g.getEmail()+"\t"+
					g.getCompany()+"\t"+g.getDept()+"\t"+g.getDuty());
			for (Meeting m : g.getMeetings()) {
				System.out.println("=====>  "+m.getId()+"\t"+m.getMeetingName()+"\t"+m.getStartTime()+"\t"+m.getEndTime());
			}
		}
	}

	/**
	 * 测试新增嘉宾功能
	 * 增加嘉宾的同时，指定嘉宾需要参加的会议（通过数据指定要参加会议的id）
	 */
	@Test
	public void addGuestTest(){
		Guest guest = new Guest();
		guest.setGuestName("李金鑫");
		guest.setTelephone("13789847324");
		guest.setIsHidden(0);
		guest.setSex("男");
		guest.setEmail("lijinxin@163.com");
		guest.setCompany("众创软件");
		guest.setDept("软件研发");
		guest.setDuty("技术经理");
		guest.setIsShow(1);
		gs.addGuest(guest, new int[]{1,3,4});
	}
	
	/**
	 * 测试删除嘉宾
	 * 指定删除id
	 */
	@Test
	public void deleteGuestTest(){
		gs.deleteGuest(9);
	}
	
	
	/**
	 * 测试修改嘉宾
	 * 
	 */
	@Test
	public void updateGuestTest(){
		Guest guest = gs.findGuestById(10);
		guest.setGuestName("第三个夫");
		gs.updateGuest(guest, new int[]{2,4,5});
	}
	
}
