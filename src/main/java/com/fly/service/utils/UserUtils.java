package com.fly.service.utils;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.fly.pojo.FlyUser;

/**
 * user工具类
 * @author liuwei
 *
 */
public class UserUtils {
	
	
	/**获取当前用户
	 * 
	 * @return
	 */
	public static final FlyUser getCurrentUser() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession(true);
		if(session.getAttribute("user")!=null) {
			FlyUser user = (FlyUser) session.getAttribute("user");
			return user;
		}
		return null;
	}
	/**
	 * 用户是否登录
	 * @return
	 */
	public static boolean isLogin() {
		
		FlyUser user = getCurrentUser();
		if(user == null) {
			return false;
		}
		return true;	
	}
}
