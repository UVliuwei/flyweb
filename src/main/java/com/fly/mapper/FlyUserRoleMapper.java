package com.fly.mapper;

import java.util.List;

public interface FlyUserRoleMapper {
	
	List<String> getRoleByUserId(String userId);
	
	void insertUserRole(String userId, String roleId);
}
