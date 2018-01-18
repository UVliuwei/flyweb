package com.fly.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fly.common.SaltPasswordUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fly.common.SaltPasswordUtil;
import com.fly.common.SessionUtil;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyUser;
import com.fly.service.LoginService;
import com.fly.service.UserService;
import com.fly.service.utils.UserUtils;


@Controller
@RequestMapping("user")
public class LoginController extends BaseController{
	
	@Autowired
	private LoginService loginService;
	@Autowired
	private UserService userService;
	
	/**
	 * 注册验证
	 * @return
	 */
	@RequestMapping(value="reg",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String register(FlyUser user,String repassword,String code,HttpServletRequest request) {
		
		//String regCode=SessionUtil.getSession(request, "regCode");
		if(user.getPassword().length()<6 || user.getPassword().length()>16) {
			return FlyResult.error("密码长度不合法");
		}
		if(repassword != null && !repassword.equals(user.getPassword())) {
			return  FlyResult.error("两次输入的密码不一致");
		} 
		user.setPassword(SaltPasswordUtil.getNewPassword(user.getPassword()));
		String result = loginService.checkRegister(user);
        return result;
		
	}
	/**
	 * 登录验证
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
	@ResponseBody
	public String checkLogin(FlyUser user ,String code,HttpServletRequest request) {
		
//		String logCode=SessionUtil.getSession(request, "logCode");
//		if(!code.equals(logCode)) {
//			return "code";
//		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getEmail(), SaltPasswordUtil.getNewPassword(user.getPassword()));
		try {
			subject.login(token);
		} catch (LockedAccountException lock) {
			System.out.println("账号已被锁定");
			return FlyResult.error("账号已被锁定");
		} catch (Exception e) {
			return FlyResult.error("用户名或密码错误");
		}
		FlyUser suser=userService.getUserByEmail(user.getEmail());
		setUserSession(suser);
		return FlyResult.action("/user/index","登录成功");
	}
	/**
	 * 退出登录
	 * @param request
	 * @return
	 */
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();		
		return "redirect:/user/login";
	}
	
	/**
	 * 界面跳转
	 * @return
	 */
	@RequestMapping(value="reg",method=RequestMethod.GET)
	public String toReg() {
		if(UserUtils.isLogin()) {
			return "redirect:/user/index";
		}
		return "/user/reg";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String toLogin() {
		if(UserUtils.isLogin()) {
			return "redirect:/user/index";
		}
		return "/user/login";
	}
}
