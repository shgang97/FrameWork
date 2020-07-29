package com.shgang.spring5.ioc_demo1.testdemo;

import com.shgang.spring5.ioc_demo1.Book;
import com.shgang.spring5.ioc_demo1.Orders;
import com.shgang.spring5.ioc_demo1.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

	@Test
	public void testOrders() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo1/bean1.xml");
		Orders order = context.getBean("order", Orders.class);
		System.out.println(order);
		order.print();
	}

	@Test
	public void testBook() {
		//1 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo1/bean1.xml");

		//2 获取配置创建的对象
		Book book = context.getBean("book", Book.class);

		System.out.println(book);
		book.print();

	}

	@Test
	public void testAdd() {
		//1 加载spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo1/bean1.xml");

		//2 获取配置创建的对象
		User user = context.getBean("user", User.class);

		System.out.println(user);
		user.add();

	}
}
