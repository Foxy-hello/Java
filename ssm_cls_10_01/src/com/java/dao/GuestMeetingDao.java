package com.bawei.dao;

import org.apache.ibatis.annotations.Param;

public interface GuestMeetingDao {
	/**
	 * 新增嘉宾时，需要向中间表插入数据
	 * @param gid 嘉宾id
	 * @param mid 会议id
	 * @return
	 */
	public int addRelation(@Param("gid")int gid,@Param("mid")int mid);

	/**
	 * 根据嘉宾id删除与之对应的所有关联信息
	 * 删除嘉宾时需要调用
	 * @param gid
	 * @return
	 */
	public int deleteByGuestId(int gid);
	
	public int addRelation1(@Param("gid")int gid,@Param("mids")int[] mids);

	
}
