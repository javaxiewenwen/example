package example;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.xww.domain.Emp;
import com.cn.xww.service.IEmpService;


//@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})

public class TestMyBatis {
//	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
//	@Resource
//	private IEmpService empService = null;
//
//	/*@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//		empService = (IEmpService) ac.getBean("empService");
//	}*/
//
//	@Test
//	public void test1() {
//		System.out.println("======进来了");
//		Emp emp = empService.getEmpNO(7369);
//		 System.out.println(emp.getEname());
//		// logger.info("值："+user.getUserName());
//		//logger.info(JSON.toJSONString(user));
//	}
	
}
