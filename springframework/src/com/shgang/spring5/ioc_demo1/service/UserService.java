package com.shgang.spring5.ioc_demo1.service;

import com.shgang.spring5.ioc_demo1.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		System.out.println("service add...");

		//创建UserDao对象
//		UserDaoImpl userDao = new UserDaoImpl();
		userDao.update();
	}
}
