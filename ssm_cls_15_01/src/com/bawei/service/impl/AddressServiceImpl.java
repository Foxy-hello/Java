package com.bawei.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.AddressDao;
import com.bawei.pojo.Address;
import com.bawei.service.AddressService;


@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressDao addressDao;

	@Override
	public List<Address> queryAddressByPid(int pid) {
		return addressDao.queryAddressByPid(pid);
	}
	

}
