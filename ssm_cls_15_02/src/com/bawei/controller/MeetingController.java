package com.bawei.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.Address;
import com.bawei.pojo.Meeting;
import com.bawei.service.AddressService;
import com.bawei.service.MeetingService;
import com.github.pagehelper.PageInfo;

@Controller
public class MeetingController {
	@Autowired
	private MeetingService meetingService;
	
	@RequestMapping("/toMeetingAdd")
	public String toMeetingAdd(Model model){
		model.addAttribute("meeting", new Meeting());
		return "meetingAdd";
	}
	
	
	@RequestMapping("/addMeeting")
	public String addMeeting(Meeting meeting){
		String[] nums = meeting.getTelephone().split("-");
		System.out.println(nums[0]+"\t"+nums[1]);

		meetingService.addMeeting(meeting);
		//重定向到查询会议请求（此处省略查询，请查看原先代码）
		return "redirect:/queryMeeting";	
	}
}






















