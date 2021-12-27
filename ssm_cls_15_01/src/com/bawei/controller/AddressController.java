package com.bawei.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.pojo.Address;
import com.bawei.service.AddressService;

@Controller
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	/*查询所有的省*/
	@RequestMapping("/queryAddressByPid")
	@ResponseBody
	public List<Address> queryAddressByPid(@RequestParam(value="pid",required=false,defaultValue="0")int pid){
		List<Address> list=addressService.queryAddressByPid(pid);
		return list;
	}
}







