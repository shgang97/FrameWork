package com.shgang.spring5.ioc_demo3.testdemo;

import com.shgang.spring5.ioc_demo3.config.SpringConfig;
import com.shgang.spring5.ioc_demo3.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	@Test
	public void testConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		userService.add();
	}

	@Test
	public void testService() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo3/bean1.xml");
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);
		userService.add();
	}
}
