package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.entity.AuthUser;
import com.lanou.mapper.AuthUserMapper;
import com.lanou.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Resource
	public AuthUserMapper authUserMapper;
	
	@Override
	public AuthUser selectByUserAndPwd(String username, String password) {
		// TODO Auto-generated method stub
		return authUserMapper.selectByUserAndPwd(username, password);
	}

	@Override
	public List<AuthUser> selectByUser(String username) {
		// TODO Auto-generated method stub
		return authUserMapper.selectByUser(username);
	}

}
