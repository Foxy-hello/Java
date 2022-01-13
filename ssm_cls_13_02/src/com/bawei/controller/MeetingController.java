package com.bawei.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.bawei.pojo.Meeting;
import com.bawei.service.MeetingService;
import com.github.pagehelper.PageInfo;

@Controller
public class MeetingController {
	@Autowired
	private MeetingService meetingService;
	/**
	 * 查询所有的会议信息
	 * @return 
	 */
	@RequestMapping("/queryMeetingAll")
	public ModelAndView queryMeetingAll(Meeting meeting,
			@RequestParam(required=false,defaultValue="1")int page,
			@RequestParam(required=false,defaultValue="3")int rows){
		ModelAndView mv=new ModelAndView();
		List<Meeting> meetings=meetingService.findMeeting(meeting,page,rows);
		mv.addObject("meetings", new PageInfo<Meeting>(meetings));
		mv.addObject("meeting", meeting);
		mv.addObject("page", page);
		mv.addObject("rows", rows);
		mv.setViewName("meetingManager");
		return mv;
	}
	/**
	 * 增加会议
	 * @param meet 会议实体对象
	 * @return 
	 */
	@RequestMapping("/addMeeting")
	public String addMeeting(Meeting meet){
	   meet.setState(0);//新增会议默认状态为0 未发布状态״̬
	   int result=meetingService.addMeeting(meet);
	   if(result>0){
		   return "redirect:queryMeetingAll";
	   }else{
		   return "pages/meetingAdd";
	   }
	}
	/**
	 * 删除会议
	 * @param id 会议id
	 * @return
	 */
	@RequestMapping("/deleteMetting")
	public String deleteMeeting(int id){
		int result=meetingService.deleteMeetingById(id);
		return "redirect:queryMeetingAll";
	}
	/**
	 * 根据id查询会议实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryMettingById")
	public ModelAndView queryMetting(int id){
		ModelAndView mv=new ModelAndView();
		Meeting meeting=meetingService.findMeetingById(id);
		mv.addObject("meet", meeting);
		mv.setViewName("meetingUpdate");
		return mv;
	}
	/**
	 * 修改会议
	 * @param meet
	 * @return
	 */
	@RequestMapping("/updateMeeting")
	public String updateMeeting(Meeting meet){
		int result=meetingService.updateMeetingById(meet);
		return "redirect:queryMeetingAll";
	}
	
}







