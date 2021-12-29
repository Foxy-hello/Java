package com.bawei.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.User;
import com.bawei.pojo.UserDetail;
import com.bawei.service.UserDetailService;
import com.bawei.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserDetailService userDetailService;
	/**
	 * 登录
	 * @param user 用户名密码用户实体
	 * @param session 会话对象
	 * @param model  存储传递jsp页面数据
	 * @param request 请求对象
	 * @param response 响应对象
	 * @return
	 */
	@RequestMapping("/login")
	public String login(User user,HttpSession session,
			HttpServletRequest request,HttpServletResponse response){
		//1.根据输入用户名和密码判断登录是否成功
		User u=userService.login(user);
		if(u!=null){
			session.setAttribute("user", u);
			//2.记录登录时间
			SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss");
			String curTime=format.format(new Date());
			session.setAttribute("lastTime", curTime);
			return "forward:queryUserDetail";
		}else{
			return "login";
		}
	}
	/**
	 * 根据登录用户id查询详情信息
	 * @param userId 用户id
	 * @return
	 */
	@RequestMapping("/queryUserDetail")
	public String queryUserDeatail(HttpSession session,Model model){
		User user=(User) session.getAttribute("user");
		Integer userId=user.getId();
		UserDetail userDetail=userDetailService.findUserDeatailByUserId(userId);
		model.addAttribute("userDetail",userDetail);
		return "index";
	}
	
}
