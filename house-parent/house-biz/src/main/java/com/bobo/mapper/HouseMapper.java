package com.bobo.mapper;

import com.bobo.pojo.City;
import com.bobo.pojo.House;
import com.bobo.pojo.Shangquan;

import java.util.List;

public interface HouseMapper {

    /**
     * 列表
     * @param house
     * @return
     */
    List<House> list(House house);


    /**
     * 增加楼盘
     * @param house
     * @return
     */
    int add(House house);

    /**
     * 增加楼盘商圈中间表
     * @param house
     * @return
     */
    int addHouseShangQuan(House house);


    /**
     * 根据pid获取城市对象
     * @param pid
     * @return
     */
    List<City> getCity(Integer pid);


    /**
     *根据市id 查询商圈--用存储过程实现
     * @param cid
     * @return
     */
    List<Shangquan> getShangQuan(Integer cid);

    /**
     * 统计数据
     * @param cid
     * @return
     */
    List<House> getTJ(Integer cid);
}
