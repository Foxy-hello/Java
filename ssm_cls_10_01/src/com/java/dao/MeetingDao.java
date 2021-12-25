package com.bawei.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.bawei.pojo.Meeting;

public interface MeetingDao {
	
	/**
	 * 查询会议
	 * 根据会议编号、会议名称、会议状态、会议时间动态查询
	 * @param meeting 查询条件
	 * @return 符合条件的会议
	 */
	public List<Meeting> findMeeting(Meeting meeting);
	
	/**
	 * 通过参会人员id查找他所参加的所有会议
	 * @param gid 参会人员id
	 * @return
	 */
	public List<Meeting> findMeetingByGuestId(int gid);
	
}
