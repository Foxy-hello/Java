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
	
	/**
	 * 新增会议
	 * @param meeting 要新增的会议
	 * @return 受影响的行数
	 */
	public int add(Meeting meeting);
	
	/**
	 * 根据会议id删除会议
	 * 实现单删和批量删除
	 * @param id 要删除会议的id
	 * @return 受影响的行数
	 */
	public int deleteMeetingById(int... ids);
	
	/**
	 * 更新会议，根据会议id，使用动态sql更新会议信息
	 * @param meeting 要更新的会议
	 * @return 受影响的行数
	 */
	public int updateMeetingById(Meeting meeting);
	
	/**
	 * 根据id查询会议信息
	 * @param id
	 * @return
	 */
	public Meeting findMeetingById(int id);
}
