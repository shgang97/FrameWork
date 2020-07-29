package com.shgang.spring5.ioc_demo1.dao;

public class UserDaoImpl implements UserDao{
	@Override
	public void update() {
		System.out.println("dao update...");
	}
}
