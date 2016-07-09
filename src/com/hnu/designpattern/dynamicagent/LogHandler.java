package com.hnu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler{
	private Object target;//代理对象
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	public void beforeMethod(Method m){
		System.out.println("before method--"+m.getName());
	}
	public void afterMethod(Method m){
		System.out.println("after method--"+m.getName());
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		beforeMethod(method);
		
		method.invoke(target, args);
		
		afterMethod(method);
		return null;
	}

}
