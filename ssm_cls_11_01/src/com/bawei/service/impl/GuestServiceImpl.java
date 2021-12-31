package com.bawei.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.GuestDao;
import com.bawei.pojo.Guest;
import com.bawei.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestDao guestDao;
	
	
	@Override
	public List<Guest> findGuest(Map<String, Object> map){
		return guestDao.findGuest(map);
	}


	@Override
	public List<Map<String,Object>> findGuestJoin(Map<String, Object> map) {
		return guestDao.findGuestJoin(map);
	}
}
