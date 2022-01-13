package com.bawei.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.bawei.pojo.User;
import com.bawei.pojo.UserVo;

@Controller
public class BindingController {
	/**
	 * 1)POJO（实体类）类型的绑定 
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("/pojo")
    public String pojo(User user,HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
       System.out.println("id:"+user.getId()+",用户名:"+user.getUsername()+
    		   	",性别:"+user.getSex()+",出生日期:"+user.getBirthday());
        return "success";
    }
	/**
	 * 2)复合实体类参数绑定
	 * User对象中有ContactInfo属性，但是，在表单代码中，需要使用“属性名(对象类型的属性).属性名”来命名input的name。
	 */
		@RequestMapping("/pojo2")
		public String pojo(User user){
			System.out.println("id:"+user.getId()+",用户名:"+user.getUsername()+
	    		   	",性别:"+user.getSex()+",出生日期:"+user.getBirthday());
			System.out.println("联系人信息:id:"+user.getContactInfo().getId()+
					",电话:"+user.getContactInfo().getTel()+
					",地址:"+user.getContactInfo().getAddress());
			return "success";
		}
		/**
		 * 3)数组绑定
		 * 需求：我们查询出所有User 的信息，并且在JSP页面遍历显示，这时候点击提交按钮，
		 * 需要在 Controller 中获得页面中显示复选框的所有值的数组集合。
		 * JSP 页面：注意爱好的name值定义为 hobby
		 */
		@RequestMapping(value="array")
		public String array(String[] hobby){
			for(String h:hobby){
				System.out.print(h+"\t");
			}
			return "success";
		}	
		/**
		 * 4)List集合参数绑定
		 * 修改页面的值后，点击提交
		 */
		@RequestMapping("list")
		public String list(UserVo userVo){
			List<User> list=userVo.getUserList();
			for(User user:list){
				System.out.println("用户ID:"+user.getId()+",用户名:"+user.getUsername()+
						",性别:"+user.getSex());
			}
			return "success";
		}
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		//true:允许输入空值，false:不能为空值 
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
}
