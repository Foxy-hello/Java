package com.bawei.service;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.bawei.pojo.Meeting;

public interface MeetingService {
	
	/**
	 * 查询会议
	 * 根据会议编号、会议名称、会议状态、会议时间动态查询
	 * @param meeting 查询条件
	 * @return 符合条件的会议
	 */
	public List<Meeting> findMeeting(Meeting meeting);
	
	
}
