package com.agumen.alpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agumen.alpha.dao.UserDao;
import com.agumen.alpha.domain.User;

@Service
public class UserService{
	
	@Autowired
	private UserDao userDao;
	
	public boolean hasMatchUser(String user_name,String password) {
		int matchCount = userDao.getMatchCount(user_name, password);
		return matchCount>0;
	}
	
	public User findUserByUserName(String user_name) {
		return userDao.findUserByUserName(user_name);
	}
}