package com.fly.shiro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.fly.pojo.FlyAuthority;
import com.fly.pojo.FlyRole;
import com.fly.pojo.FlyUser;
import com.fly.service.RoleService;
import com.fly.service.UserService;
import com.fly.service.utils.UserUtils;

public class MyShiroRealm extends AuthorizingRealm {
	
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserService userService;
	/**
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String email = (String) principals.fromRealm(getName()).iterator().next();
		FlyUser user = UserUtils.getCurrentUser();
		//获取角色集合
		Set<String> roleNames = new HashSet<String>(); 
		Set<FlyRole> roleList = roleService.getRoleByUserId(user.getId());
		for (FlyRole flyRole : roleList) {
			roleNames.add(flyRole.getType());
		}
		//权限集合
        Set<String> permissions = new HashSet<String>(); 
        Set<FlyAuthority> authoritieList = roleService.getAuthByUserId(user.getId());
        for (FlyAuthority flyAuthority : authoritieList) {
			permissions.add(flyAuthority.getAuth());
		}
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);  
        info.setStringPermissions(permissions);  
        return info;  
        
	}
	
	/**
	 * 登陆验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
 
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String email = token.getUsername();
        FlyUser user = userService.getUserByEmail(email);

		if(user!=null) {
			if("1".equals(user.getLocked())) {
	        	throw new LockedAccountException();
	        } else {
	        	return new SimpleAuthenticationInfo(user.getEmail(), user.getPassword(), getName());  
	        }
	    } else {
	       throw new UnknownAccountException();
	    }	     
	}
}
