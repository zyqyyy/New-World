package com.lanou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lanou.entity.AuthUser;

public interface UserService {
	
	AuthUser selectByUserAndPwd(String username,String password);
	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return
	 */
	List<AuthUser> selectByUser(@Param(value = "username") String username);

}
