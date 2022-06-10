package com.bobo.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 统一结果返回对象
 * @author: BOBO
 * @time: 2022/6/9 16:07
 */
@Data
public class HouseResult  implements Serializable {
    private Integer code;//状态码
    private String name;//状态名称
    private String data;//内容


}
