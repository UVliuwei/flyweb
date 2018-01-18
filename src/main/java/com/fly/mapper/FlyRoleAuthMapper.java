package com.fly.mapper;

import java.util.List;

public interface FlyRoleAuthMapper {
	
	public List<String> getAuthByRoleId(String roleId);
}
