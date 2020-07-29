package com.shgang.spring5.ioc_demo1.testdemo;

import com.shgang.spring5.ioc_demo1.bean.Emp;
import com.shgang.spring5.ioc_demo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	@Test
	public void testEmp2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo1/bean4_1.xml");
		Emp emp = context.getBean("emp", Emp.class);
		emp.add();
	}

	@Test
	public void testEmp1() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo1/bean4.xml");
		Emp emp = context.getBean("emp", Emp.class);
		emp.add();
	}
	@Test
	public void testDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo1/bean2.xml");
		UserService userService = context.getBean("userService", UserService.class);
		userService.add();

	}
}
