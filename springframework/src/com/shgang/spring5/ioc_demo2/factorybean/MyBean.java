package com.shgang.spring5.ioc_demo2.factorybean;

import com.shgang.spring5.ioc_demo2.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		Course course = new Course();
		course.setCname("abc");
		return course;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}
}
