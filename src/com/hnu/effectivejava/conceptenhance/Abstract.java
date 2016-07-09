package com.hnu.effectivejava.conceptenhance;

import java.util.ArrayList;


abstract class AbstractClass {
	private int variable;
	
	public void method(){
		System.out.println("concreate method");
	}
	
	public void method1(){
		System.out.println("concreate method1");
	}
	
	public abstract void method2();
}

class AClass extends AbstractClass{
	public static void m(){
		System.out.println("AClass m");
	}
//	public void method1(){
//		System.out.println("AClass method1");
//	}
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("AClass method2");
	}
	
}


public class Abstract{
	static int i = 1;
	public static void main(String[] args) {
		AbstractClass a = new AClass();
		a.method();
		a.method1();
		a.method2();
		System.out.println(Abstract.i);
		System.out.println(new Abstract().i);
		
	}
}
