package com.fly.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fly.common.SaltPasswordUtil;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyUser;
import com.fly.service.UserService;
import com.fly.service.utils.UserUtils;

@Controller
@RequestMapping("user")
public class UserController extends BaseController{
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public FlyUser getUser() {
		if(UserUtils.getCurrentUser()!=null) {
			return UserUtils.getCurrentUser();
		}
		return new FlyUser();
	}
	
	/**
	 * 更新user信息
	 */
	@RequestMapping(value="set",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String updateInfo(FlyUser user,HttpServletRequest request) {
		
		String result = userService.updateUserInfo(user);
		FlyUser suser=userService.getUserById(user.getId());
		setUserSession(suser);
		return result;
	}
	/**
	 * 更新password信息
	 */
	@RequestMapping(value="repass",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String updatePass(String id,String nowpass,String pass,String repass) {
		if(pass.length()<6 || pass.length()>16) {
			return FlyResult.error("密码长度不合法");
		}
		if(!pass.equals(repass)) {
			return FlyResult.error("两次输入的密码不一致");
		}
		String result = userService.updateUserPassword(id,SaltPasswordUtil.getNewPassword(nowpass), SaltPasswordUtil.getNewPassword(pass));
		return result;
	}
	/**
	 * 页面跳转
	 */
	@RequestMapping(value ="{path}",method=RequestMethod.GET)
	public String toReg(@PathVariable String path,Model model) {
		return "user/"+path;
	}
	
}
