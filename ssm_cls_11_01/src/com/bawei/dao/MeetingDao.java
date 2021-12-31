package com.bawei.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.bawei.pojo.Meeting;

public interface MeetingDao {
	/**
	 * 通过参会人员id查找他所参加的所有会议
	 * @param gid 参会人员id
	 * @return
	 */
	//public List<Meeting> findMeetingByGuestId();
	
}
