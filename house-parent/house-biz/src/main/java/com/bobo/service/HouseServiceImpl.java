package com.bobo.service;

import com.bobo.mapper.HouseMapper;
import com.bobo.pojo.City;
import com.bobo.pojo.House;
import com.bobo.pojo.Shangquan;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/5/24 8:54
 */
@Service
@Transactional
public class HouseServiceImpl  implements  HouseService{
    @Autowired
    HouseMapper houseMapper;

    @Override
    public int add(House house) {
        //1.增加楼盘主表--返回自增住建值
      int i=  houseMapper.add(house);

        //2。增加楼盘明细表
        houseMapper.addHouseShangQuan(house);

        return i;
    }

    @Override
    public List<City> getCity(Integer pid) {
        return houseMapper.getCity(pid);
    }

    @Override
    public List<Shangquan> getShangQuan(Integer cid) {
        return houseMapper.getShangQuan(cid);
    }

    @Override
    public PageInfo<House> list(House house, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<House> list = houseMapper.list(house);

        return new PageInfo<>(list);
    }

    @Override
    public List<House> getTJ(Integer cid) {
        return houseMapper.getTJ(cid);
    }
}
