package com.ygmy.quicksale.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ygmy.quicksale.dao.StaffEntityMapper;
import com.ygmy.quicksale.pojo.StaffEntity;
import com.ygmy.quicksale.service.StaffService;

@Service("StaffService")
public class StaffServiceImpl implements StaffService {
	@Resource
	private StaffEntityMapper staffDao;

	// @Override
	public StaffEntity getStaffById(int staffId) {
		// TODO Auto-generated method stub
		return this.staffDao.selectByPrimaryKey((byte) staffId);
	}

}
