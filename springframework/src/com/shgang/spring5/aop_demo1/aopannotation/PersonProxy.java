package com.shgang.spring5.aop_demo1.aopannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class PersonProxy {

	@Before(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
	public void before() {
		System.out.println("Person Before ...");
	}
}
