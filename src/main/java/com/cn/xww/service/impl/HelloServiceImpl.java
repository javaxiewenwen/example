package com.cn.xww.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cn.xww.IDao.EmpMapper;
import com.cn.xww.controller.EmpController;
import com.cn.xww.domain.Emp;
import com.cn.xww.service.IEmpService;
import com.cn.xww.service.IHelloService;
public class HelloServiceImpl implements IHelloService{
	// ÈÕÖ¾¼ÇÂ¼Æ÷
			private static Logger _logger = Logger
					.getLogger(HelloServiceImpl.class);
	public String sayHello(String name) {
		// TODO Auto-generated method stubs
		return  "hello"+name;
	}


}
