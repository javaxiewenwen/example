package com.cn.xww.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.xww.domain.Emp;
import com.cn.xww.service.IEmpService;
@Controller
public class EmpController {
	// 日志记录器
		private static Logger _logger = Logger
				.getLogger(EmpController.class);
	@Resource
	private IEmpService empService;
	@RequestMapping("toindex")
	public String toIndex(HttpServletRequest httpServletRequest,Emp emp,String appFrom){
		System.out.println("appFrom="+appFrom);
		_logger.info("进来测试了");
		System.out.println("======进来了"+empService);
		Emp emp1 = empService.getEmpNO(7369);
		System.out.println(emp1.getEname());
		_logger.info("测试完成");
		return "index";
		
	}
}
