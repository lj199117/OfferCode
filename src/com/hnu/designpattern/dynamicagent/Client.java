package com.hnu.test;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		//�������������
		UserDao userDao = new UserDaoImpl();//��Ҫ������
		//��������
		LogHandler logHandler = new LogHandler();
		logHandler.setTarget(userDao);
		//���ɴ�����
		UserDao userDaoProxy = (UserDao)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), logHandler);
		
		//ִ�д������еĽӿڷ���
		userDaoProxy.addUser();
		userDaoProxy.delUser();
	}
}
