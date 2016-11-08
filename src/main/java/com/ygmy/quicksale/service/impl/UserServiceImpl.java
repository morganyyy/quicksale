package com.ygmy.quicksale.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ygmy.quicksale.dao.IUserDao;
import com.ygmy.quicksale.pojo.User;
import com.ygmy.quicksale.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	// @Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
