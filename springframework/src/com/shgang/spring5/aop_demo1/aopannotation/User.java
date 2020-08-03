package com.shgang.spring5.aop_demo1.aopannotation;

import org.springframework.stereotype.Component;

@Component
public class User {

	public void add() {
//		int i = 10 / 0;
		System.out.println("add...");
	}
}
