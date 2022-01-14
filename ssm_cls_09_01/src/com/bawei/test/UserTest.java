package com.bawei.test;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bawei.pojo.User;
import com.bawei.pojo.UserDetail;
import com.bawei.service.UserDetailService;
import com.bawei.service.UserService;

public class UserTest {
	private UserService userService;
	private UserDetailService userDetailService;
	@Before
	public void setUp(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		userService = (UserService) context.getBean("userServiceImpl");
		userDetailService=(UserDetailService) context.getBean("userDetailServiceImpl");
	}
	/**
	 * 1、查询所有的用户
	 */
	@Test
	public void testFindUser(){
		List<User> users=userService.findUserAll();
		for(User user:users){
			System.out.println(user.getId()+"\t"+user.getUserName()+"\t"+user.getPassword()+
					"\t"+user.getUserDetail().getNikeName()+"\t"
					+user.getUserDetail().getSex()+"\t"+user.getUserDetail().getTelephone()+"\t"+
					user.getUserDetail().getEmail()+"\t"+user.getUserDetail().getCompany()+"\t"+
					user.getUserDetail().getDept()+"\t"+user.getUserDetail().getDuty()+"\t"+
					user.getUserDetail().getPhoto());
		}
	}
	/**
	 * 2.1、新增用户数据 (单纯操作用户表)
	 */
	@Test
	public void testInsertUser(){
		User user=new User();
		user.setUserName("cmb");
		user.setPassword("123456");
		int result=userService.insertUser(user);
		if(result>0){
			System.out.println("新增用户成功!");
		}else{
			System.out.println("新增用户失败!");
		}
	}
	/**
	 * 2.2、新增用户数据   (操作用户表+用户详情表)
	 */
	@Test
	public void testInsertUserAndDetail(){
		//新增用户信息
		User user=new User();
		user.setUserName("mycq");
		user.setPassword("123456");
		UserDetail userDetail=new UserDetail("梅雨初晴","女", "15054976000", "mycq@163.com",
				"北京八维研修学院", "教育研究院", "研发经理", "zhang.jpg");
		boolean bl=userService.insertUserAndDetail(user, userDetail);
		if(bl){
			System.out.println("新增用户成功!");
		}else{
			System.out.println("新增用户失败!");
		}
	}
	/**
	 * 3.1、修改
	 * 1、根据id查询当前修改用户信息  User 
	 * 2、判断用户详情表中是否存在数据 UserDetail
	 * 3.1、用户详情表中存在数据  修改
	 * 3.2、用户详情表中不存在数据  新增
	 */
	@Test
	public void updateUserDetail(){
		Integer userId=6;
//		1、根据id查询当前修改用户信息  User 
		User user=userService.findUserById(userId);
		if(user!=null){
//			2、判断用户详情表中是否存在数据 UserDetail
			UserDetail userDetail=userDetailService.findUserDeatailByUserId(userId);
			UserDetail detail=new UserDetail("波妞", "女", "15953965432", "52345700@qq.com", 
							"北京八维研修学院", "教育研究院", "研发工程师", "zhang.jpg");
			detail.setUserId(userId);
			boolean bl=userService.updateUser(userDetail, detail);
			if(bl){
				System.out.println("修改用户成功!");
			}else{
				System.out.println("修改用户失败!");
			}
		}else{
			System.out.println("当前用户不存在！");
		}
	}
	
	/**
	 * 4、删除用户信息
	 */
	@Test
	public void deleteUser(){
		int userId=5;
		boolean bl=userService.deleteUser(userId);
		if(bl){
			System.out.println("删除用户成功!");
		}else{
			System.out.println("删除用户失败!");
		}
	}
}






