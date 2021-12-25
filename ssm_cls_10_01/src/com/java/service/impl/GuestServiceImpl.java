package com.bawei.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.GuestDao;
import com.bawei.dao.GuestMeetingDao;
import com.bawei.pojo.Guest;
import com.bawei.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestDao guestDao;
	
	@Autowired
	private GuestMeetingDao guestMeetingDao;
	
	@Override
	public List<Guest> findGuest(Guest guest){
		return guestDao.findGuest(guest);
	}

	@Override
	public int addGuest(Guest guest, int[] mids) {
		try {
			guestDao.addGuest(guest);
			for (int mid : mids) {
				guestMeetingDao.addRelation(guest.getId(), mid);
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	@Override
	public int addGuest1(Guest guest, int[] mids) {
		try {
			guestDao.addGuest(guest);
			guestMeetingDao.addRelation1(guest.getId(), mids);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	

	@Override
	public int deleteGuest(int gid) {
		try {
			guestMeetingDao.deleteByGuestId(gid);
			guestDao.deleteGuestById(gid);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public Guest findGuestById(int gid) {
		return guestDao.findGuestById(gid);
	}

	@Override
	public int updateGuest(Guest guest,int[] mids) {
		try {
			guestDao.updateGuest(guest);
			guestMeetingDao.deleteByGuestId(guest.getId());
			guestMeetingDao.addRelation1(guest.getId(),mids);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}
}
