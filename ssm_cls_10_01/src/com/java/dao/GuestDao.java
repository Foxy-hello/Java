package com.bawei.dao;

import java.util.List;
import java.util.Map;

import com.bawei.pojo.Guest;

public interface GuestDao {
	/**
	 * 查询嘉宾信息
	 * @return
	 */
	public List<Guest> findGuest(Guest guest);
	
	/**
	 * 新增嘉宾
	 * @param guest
	 * @return
	 */
	public int addGuest(Guest guest);
	
	/**
	 * 根据id删除嘉宾信息
	 * @param gid 嘉宾id
	 * @return
	 */
	public int deleteGuestById(int id);
	
	
	/**
	 * 根据嘉宾id查询单个嘉宾信息
	 * @param gid 嘉宾id
	 * @return
	 */
	public Guest findGuestById(int gid);
	
	/**
	 * 修改嘉宾信息
	 * @param guest
	 * @return
	 */
	public int updateGuest(Guest guest);
	
}
