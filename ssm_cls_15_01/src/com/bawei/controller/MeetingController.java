package com.bawei.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/addMeeting")
	@ResponseBody
	public int addMeeting(Meeting meeting) throws IllegalStateException, IOException{
	   return meetingService.addMeeting(meeting);
	}
	
}






















