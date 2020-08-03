package com.shgang.spring5.aop_demo1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

	public static void main(String[] args) {
		//创建接口实现类的代理对象
		Class[] interfaces = {UserDao.class};

//		Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//			@Override
//			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//				return null;
//			}
//		});

		UserDaoImpl userDao = new UserDaoImpl();
		UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
		int res = dao.add(1, 2);
		System.out.println("res:" + res);
		String id = dao.update("1234");
		System.out.println(id);

	}
}


//创建代理对象
class UserDaoProxy implements InvocationHandler {
	private Object obj;

	//1 把创建的是谁的代理对象，就把谁传递过来
	//有参构造传递


	public UserDaoProxy(Object obj) {
		this.obj = obj;
	}

	//增强的逻辑
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		//方法之前
		System.out.println("方法之前执行..." + method.getName() + "：传递的参数..." + Arrays.toString(args));

		//被增强的方法执行
		Object res = method.invoke(obj, args);

		//方法之后
		System.out.println("方法之后执行..." + obj);
		return res;
	}
}
