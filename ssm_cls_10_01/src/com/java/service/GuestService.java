package com.bawei.service;

import java.util.List;
import java.util.Map;

import com.bawei.pojo.Guest;

public interface GuestService {
	/**
	 * 查询嘉宾信息
	 * @param guest
	 * @return
	 */
	public List<Guest> findGuest(Guest guest);
	
	/**
	 * 新增嘉宾
	 * 1.维护嘉宾表，向嘉宾表添加数据
	 * 2.维护中间表，增加数据，指定嘉宾参加的是哪场会议
	 * @param guest 嘉宾信息
	 * @param mids 嘉宾参加会议的id
	 * @return
	 */
	public int addGuest(Guest guest,int[] mids);
	public int addGuest1(Guest guest,int[] mids);
	
	/**
	 * 删除嘉宾信息
	 * 1.维护中间表，删除此嘉宾相关的数据
	 * 2.维护嘉宾表，删除嘉宾信息
	 * @param gid
	 * @return
	 */
	public int deleteGuest(int gid);
	
	
	/**
	 * 根据嘉宾id查询单个嘉宾信息
	 * @param gid 嘉宾id
	 * @return
	 */
	public Guest findGuestById(int gid);
	
	/**
	 * 更新嘉宾信息
	 * @param guest
	 * @return
	 */
	public int updateGuest(Guest guest,int[] mids);
	
}
