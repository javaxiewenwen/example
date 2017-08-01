package com.cn.xww.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.xww.IDao.EmpMapper;
import com.cn.xww.domain.Emp;
import com.cn.xww.service.IEmpService;
@Service("empService")
public class EmpServiceImpl implements IEmpService{
	@Resource
	EmpMapper empMapper;

	public Emp getEmpNO(int empNO) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(empNO);
	}
	
}
