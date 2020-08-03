package com.shgang.spring5.aop_demo1.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
@Order(1)
public class UserProxy {

	//相同切入点抽取
	@Pointcut(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
	public void pointdemo() {

	}

	//前置通知
	//@Before注解表示作为前置通知
//	@Before(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
//	public void before() {
//		System.out.println("before...");
//	}
	@Before(value = "pointdemo()")
	public void before() {
		System.out.println("before...");
	}

	@After(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
	public void after() {
		System.out.println("after...");
	}

	@AfterReturning(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
	public void afterReturning() {
		System.out.println("afterReturning...");
	}

	@AfterThrowing(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
	public void afterThrowing() {
		System.out.println("afterThrowing...");
	}

	@Around(value = "execution(* com.shgang.spring5.aop_demo1.aopannotation.User.add(..))")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("around before...");
		proceedingJoinPoint.proceed();
		System.out.println("around after...");
	}
}
