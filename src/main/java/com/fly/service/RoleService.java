package com.fly.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.relation.Role;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.mapper.FlyAuthorityMapper;
import com.fly.mapper.FlyRoleAuthMapper;
import com.fly.mapper.FlyRoleMapper;
import com.fly.mapper.FlyUserRoleMapper;
import com.fly.pojo.FlyAuthority;
import com.fly.pojo.FlyRole;
import com.fly.pojo.FlyRoleExample;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

@Service
public class RoleService  {
	
	@Autowired 
	private FlyRoleMapper roleMapper;
	@Autowired
	private FlyUserRoleMapper userRoleMapper;
	@Autowired
	private FlyRoleAuthMapper roleAuthMapper;
	@Autowired
	private FlyAuthorityMapper authorityMapper;
	
	/**
	 * 获取用户所分配的角色
	 */
	public Set<FlyRole> getRoleByUserId(String userId) {
		
		List<String> roleIds = userRoleMapper.getRoleByUserId(userId);
		Set<FlyRole> roleSet = new HashSet<FlyRole>();
		for (String roleId : roleIds) {
			FlyRole role = roleMapper.selectByPrimaryKey(roleId);
			roleSet.add(role);
		}
		return roleSet;
	}
	/**
	 * 获取用户的权限
	 * @param userId
	 * @return
	 */
	public Set<FlyAuthority> getAuthByUserId(String userId) {
		Set<FlyAuthority> authSet = new HashSet<FlyAuthority>();
		Set<FlyRole> roleList = getRoleByUserId(userId);
		for (FlyRole role : roleList) {
			List<String> authIds = roleAuthMapper.getAuthByRoleId(role.getId());
			if(authIds != null && authIds.size() != 0) {
				for (String  authId : authIds) {
					FlyAuthority authority = authorityMapper.selectByPrimaryKey(authId);
					authSet.add(authority);
				}
			}
		}
		return authSet;
	}
	
	/**
	 * 通过角色名称插角色
	 * @param roleName
	 * @return
	 */
	public FlyRole getRoleIdByName(String roleName) {
		FlyRoleExample example = new FlyRoleExample();
		example.createCriteria().andTypeEqualTo("user");
		List<FlyRole> roleList = roleMapper.selectByExample(example);
		if(roleList == null||roleList.size()==0) {
			System.out.println("user角色未创建");
			return null;
		} else {
			return roleList.get(0);
		}	
	}
	public FlyRole getRoleById(String roleId) {
		return roleMapper.selectByPrimaryKey(roleId);
	}
}
