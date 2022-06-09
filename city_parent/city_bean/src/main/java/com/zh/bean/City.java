package com.zh.bean;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
    @ExcelProperty({"各省市楼盘数量","编号"})
    private Integer pid ;
    @ExcelProperty({"各省市楼盘数量","省份"})
    private String bname;
    @ExcelProperty({"各省市楼盘数量","城市"})
    private String cname;
    @ExcelProperty({"各省市楼盘数量","楼盘数量"})
    private Integer num;
}
