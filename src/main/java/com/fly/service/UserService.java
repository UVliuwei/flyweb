package com.fly.service;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fly.mapper.FlyUserMapper;
import com.fly.pojo.FlyResult;
import com.fly.pojo.FlyUser;
import com.fly.pojo.FlyUserExample;
import com.fly.pojo.FlyUserExample.Criteria;
import com.fly.service.utils.UserUtils;
@Service
public class UserService {
	
	@Autowired
	private FlyUserMapper userMapper;
	
	
	//根据昵称查询用户
	@Transactional(readOnly = true)
	public FlyUser getUserByName(String name) {
		
		FlyUserExample example=new FlyUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo(name);
		List<FlyUser> userList=userMapper.selectByExampleWithBLOBs(example);
		if(userList.size()==0) {
			return null;
		}
		return userList.get(0);
	}
	//根据email查询用户
	@Transactional(readOnly = true)
	public FlyUser getUserByEmail(String email) {
		FlyUserExample example=new FlyUserExample();
		Criteria criteria=example.createCriteria();
		criteria.andEmailEqualTo(email);
		List<FlyUser> userList=userMapper.selectByExampleWithBLOBs(example);
		if(userList.size()==0) {
			return null;
		}
		return userList.get(0);
	}
	//根据ID查询用户
	@Transactional(readOnly = true)
	public FlyUser getUserById(String Id) {
		
		FlyUser user=userMapper.selectByPrimaryKey(Id);
		return user;
	}
	//更新用户信息
	@Transactional(readOnly = false)
	public String updateUserInfo(FlyUser user) {
		
		if(user.getCity() == "") {
			return FlyResult.error("城市名称不能为空");
		}
		FlyUser user1=getUserByName(user.getName());
		if(user1!=null && !user1.getId().equals(user.getId())) {		
			return FlyResult.error("用户名已存在");	
		}
		FlyUser user2=getUserByEmail(user.getEmail());
		if(user2!=null && !user2.getId().equals(user.getId())) {
			return FlyResult.error("邮箱已被使用");	
		}
		try {
			userMapper.updateByPrimaryKeySelective(user);
			return FlyResult.action("/user/set","个人信息更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return FlyResult.error("个人信息更新失败，请重试");
		}
	}
	//修改用户密码
	@Transactional(readOnly = false)
	public String updateUserPassword(String id, String nowpass, String pass) {
		
		FlyUser user = UserUtils.getCurrentUser(); 
		if(!nowpass.equals(user.getPassword())) {
			return FlyResult.error("原密码输入错误");
		}
		try {
			FlyUser flyUser=new FlyUser();
			flyUser.setId(id);
			flyUser.setPassword(pass);
			userMapper.updateByPrimaryKeySelective(flyUser);
			SecurityUtils.getSubject().logout();
			return FlyResult.action("/user/login","密码修改成功,请重新登录");
		} catch (Exception e) {
			e.printStackTrace();
			return FlyResult.error("重置密码失败,请重试");
		}
	}

}
