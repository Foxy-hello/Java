package com.bawei.service;

import java.util.List;

import com.bawei.pojo.Address;

public interface AddressService {
	/**
	 * 根据pid查询地址
	 * pid=0 查询省
	 * pid=某个省的id 查询市
	 * 
	 * @param pid
	 * @return
	 */
	public List<Address> queryAddressByPid(int pid);
}
