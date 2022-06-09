package com.zh.controller;

import com.alibaba.excel.EasyExcel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zh.bean.City;
import com.zh.service.CityService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("findAll")
    public String findAll(@RequestParam(defaultValue = "1")Integer pageNum, Model model){
        PageHelper.startPage(pageNum,4);
        List<City> list = cityService.findAll();
        PageInfo<City> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("list",list);
        return "findAll";
    }

    @RequestMapping("getExcel")
    public ResponseEntity<byte[]>getExcel() throws IOException {
        //获取数据
        List<City> list = cityService.findAll();
        //写xls文件
        EasyExcel.write("cityNum.xls").sheet("各省市楼盘统计").doWrite(list);
        //下载,获取头文件
        File file = new File("cityNum.xls");
        HttpHeaders headers = new HttpHeaders();
        //设置编码
        String downFile = new String("cityNum.xls".getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        headers.setContentDispositionFormData("myFileDown",downFile);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
    }

    @RequestMapping("lockNum")
    public String lockNum(){
        return "lockNum";
    }

    @RequestMapping("getLockNum")
    @ResponseBody
    public Object getLockNum(){
        return cityService.findAll();
    }

}
