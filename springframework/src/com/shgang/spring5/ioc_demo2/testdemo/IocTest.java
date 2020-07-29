package com.shgang.spring5.ioc_demo2.testdemo;

import com.shgang.spring5.ioc_demo2.bean.Orders;
import com.shgang.spring5.ioc_demo2.collectiontype.Book;
import com.shgang.spring5.ioc_demo2.collectiontype.Course;
import com.shgang.spring5.ioc_demo2.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	@Test
	public void testOrderWithProcessor() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo2/bean5.xml");
		Orders orders = context.getBean("orders", Orders.class);
		System.out.println("第四步 获取创建bean实例对象");
		System.out.println(orders);

		context.close();
	}


	@Test
	public void testOrder() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo2/bean4.xml");
		Orders orders = context.getBean("orders", Orders.class);
		System.out.println("第四步 获取创建bean实例对象");
		System.out.println(orders);

		context.close();
	}


	@Test
	public void testMyBean() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo2/bean3.xml");

		Course course = context.getBean("myBean", Course.class);
		System.out.println(course);

		Course course1 = context.getBean("myBean", Course.class);
		System.out.println(course1);

		System.out.println(course == course1);//true，spring里面默认的bean是单实例对象

	}

	@Test
	public void testBook() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo2/bean2.xml");
		Book list = context.getBean("book", Book.class);
		list.print();
		Book list1 = context.getBean("book", Book.class);
		list1.print();

		System.out.println(list == list1);
	}

	@Test
	public void testCollection() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/shgang/spring5/ioc_demo2/bean1.xml");
		Stu stu = context.getBean("stu", Stu.class);
		stu.print();
	}
}
