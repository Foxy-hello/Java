package com.bobo.controller;

import com.bobo.pojo.City;
import com.bobo.pojo.House;
import com.bobo.pojo.Shangquan;
import com.bobo.service.HouseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @description:
 * @author: BOBO
 * @time: 2022/5/24 9:07
 */
@RequestMapping("house")
@Controller
public class HouseController {

    @Autowired
    HouseService houseService;


    /**
     * 列表
     * @param house
     * @param pageNum
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String list(House house, @RequestParam(defaultValue = "1") Integer pageNum,
                       @RequestParam(defaultValue = "3")  Integer pageSize, Model model){
        PageInfo<House> info = houseService.list(house, pageNum, pageSize);
        model.addAttribute("pg",info);
        model.addAttribute("house",house);
        return "list";

    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("toAdd")
    public String toAdd(){

        return "add";

    }


    /**
     * 执行添加
     * @return
     */
    @RequestMapping("add")
    public String add(House house,Model model){
        Integer[] sids = house.getSids();
        if(null==sids){
            model.addAttribute("sids","商圈至少选中一个");
            return "add";
        }


        //执行添加
        int i = houseService.add(house);
        if(i>0)
        return "redirect:/house/list";
        return "add";

    }
    /**
     * 返回所有城市json对象
     * @param pid
     * @return
     */
    @ResponseBody
    @RequestMapping("getCity")
    public List<City> getCity(Integer pid){
        return houseService.getCity(pid);
    }

    @ResponseBody
    @RequestMapping("getShangQuan")
    public List<Shangquan> getShangQuan(Integer cid){

        return houseService.getShangQuan(cid);
    }


    /**
     * 文件上传
     * @param file
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("upFile")
    public String upFile(MultipartFile file) throws IOException {
      if(null!=file && !file.isEmpty()) {
          //上传路径
          String  path="d:/pic/";
          //获取上传的原始文件名称
          String originalFilename = file.getOriginalFilename();
          String filename = UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
          File file1 = new File(path, filename);
          file.transferTo(file1);//把上传的文件内容写入到新文件
          return "/pic/"+filename;

      }
      return "上传失败,没有选择文件";
    }

    /**
     * 跳转到报表页面
     * @return
     */
    @RequestMapping("toReport")
    public String toReport(Integer pid,Integer cid,Model model){
        model.addAttribute("pid",pid);
        model.addAttribute("cid",cid);
        return "report";

    }

    /**
     * 返回统计数据
     * @param cid
     * @return
     */
    @ResponseBody
    @RequestMapping("getTJ")
    public List<House> getTJ(Integer cid){
        return houseService.getTJ(cid);
    }
}
