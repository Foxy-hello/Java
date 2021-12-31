package com.bawei.service;

import java.util.List;
import java.util.Map;

import com.bawei.pojo.Guest;

public interface GuestService {
	/**
	 * 查询嘉宾信息
	 * 使用子查询方式
	 * 可以使用PageHelper分页，给子查询设置查询条件较为复杂
	 * @param map 
	 * 	guestName 	嘉宾名字
	 * 	telephone 	嘉宾联系电话
	 * 	company		嘉宾所在公司
	 * 	meetingName	会议名称
	 * 
	 * @return
	 */
	public List<Guest> findGuest(Map<String, Object> map);
	
	/**
	 * 查询嘉宾信息
	 * 使用join编写sql语句，使用resultMap映射结果集到List集合
	 * 
	 * @param map 
	 * 	guestName 	嘉宾名字
	 * 	telephone 	嘉宾联系电话
	 * 	company		嘉宾所在公司
	 * 	address		会议地点
	 * 
	 * @return
	 */
	public List<Map<String,Object>> findGuestJoin(Map<String, Object> map);
}
