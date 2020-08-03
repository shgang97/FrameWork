package com.shgang.spring5.aop_demo1.test;

import com.shgang.spring5.aop_demo1.aopannotation.User;
import com.shgang.spring5.aop_demo1.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	@Test
	public void testXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/aop_demo1/bean2.xml");
		Book book = context.getBean("book", Book.class);
		book.buy();
	}

	@Test
	public void testAopAnno() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/aop_demo1/bean1.xml");
		User user = context.getBean("user", User.class);
		user.add();
	}
}
