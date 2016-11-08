package com.ygmy.quicksale.dao;

import com.ygmy.quicksale.pojo.StaffEntity;

public interface StaffEntityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Byte staffId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	int insert(StaffEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	int insertSelective(StaffEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	StaffEntity selectByPrimaryKey(Byte staffId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(StaffEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	int updateByPrimaryKeyWithBLOBs(StaffEntity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table staff
	 * @mbg.generated
	 */
	int updateByPrimaryKey(StaffEntity record);
}