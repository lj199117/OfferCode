package com.hnu.test;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		//创建被代理对象
		UserDao userDao = new UserDaoImpl();//需要被代理
		//创建代理
		LogHandler logHandler = new LogHandler();
		logHandler.setTarget(userDao);
		//生成代理类
		UserDao userDaoProxy = (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), logHandler);
		
		//执行代理类中的接口方法
		userDaoProxy.addUser();
		userDaoProxy.delUser();
	}
}
