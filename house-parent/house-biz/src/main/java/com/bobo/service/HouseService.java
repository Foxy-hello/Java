package com.bobo.service;

import com.bobo.pojo.City;
import com.bobo.pojo.House;
import com.bobo.pojo.Shangquan;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface HouseService {
    /**
     * 增加楼盘
     * @param house
     * @return
     */
    int add(House house);

    /**
     * 根据pid获取城市对象
     * @param pid
     * @return
     */
    List<City> getCity(Integer pid);

    /**
     * 获取市id下的商圈
     * @param cid
     * @return
     */
    List<Shangquan> getShangQuan(Integer cid);


    /**
     * 列表
     * @param house
     * @return
     */
    PageInfo<House> list(House house,Integer pageNum,Integer pageSize);

    /**
     * 统计数据
     * @param cid
     * @return
     */
    List<House> getTJ(Integer cid);
}
