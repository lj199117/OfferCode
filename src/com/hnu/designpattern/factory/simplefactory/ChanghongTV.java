package com.hnu.designpattern.factory.simplefactory;

public class ChanghongTV implements TV{

	public void create() {
		System.out.println("i am changhong tv");
	}

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("i am changhong tv, i am opening");
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("i am changhong tv, i am closing");
	}

}
