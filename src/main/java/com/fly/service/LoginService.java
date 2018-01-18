package com.fly.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fly.common.SaltPasswordUtil;
import com.fly.mapper.FlyCollectionMapper;
import com.fly.mapper.FlyUserMapper;
import com.fly.mapper.FlyUserRoleMapper;
import com.fly.pojo.FlyCollection;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyRole;
import com.fly.pojo.FlyUser;
import com.fly.pojo.FlyUserExample;
import com.fly.pojo.FlyUserExample.Criteria;

@Service
public class LoginService {
	
	@Autowired
	private FlyUserMapper userMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private FlyCollectionMapper collectionMapper;
	@Autowired
	private RoleService roleService;
	@Autowired
	private FlyUserRoleMapper userRoleMapper;
	
	@Transactional
	public String checkRegister(FlyUser user) {
		
		FlyUser flyUser1=userService.getUserByEmail(user.getEmail());
		FlyUser flyUser2=userService.getUserByName(user.getName());
		
		if(flyUser1!=null) {
			return FlyResult.error("邮箱已被使用");
		}
		if(flyUser2!=null) {
			return FlyResult.error("用户名已被注册");
		}
		//创建用户
		int number=new Random().nextInt(11);
		user.setImg(number+".jpg");
		user.preInsert();
		user.setKiss(100);
		user.setLocked("0");
		userMapper.insert(user);
		//创建收藏单
		FlyCollection collection=new FlyCollection();
		collection.setUserId(user.getId());
		collection.preInsert();
		collectionMapper.insert(collection);
		//分配用户角色
		FlyRole role = roleService.getRoleIdByName("user");
		userRoleMapper.insertUserRole(user.getId(), role.getId());
		return FlyResult.action("/user/login","注册成功");
	}

}
