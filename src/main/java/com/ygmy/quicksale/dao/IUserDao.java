package com.ygmy.quicksale.dao;

import com.ygmy.quicksale.pojo.User;

public interface IUserDao {

	User selectByPrimaryKey(Integer id);

}