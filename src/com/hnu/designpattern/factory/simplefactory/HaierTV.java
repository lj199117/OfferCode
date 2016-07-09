package com.hnu.designpattern.factory.simplefactory;

public class HaierTV implements TV{

	public void create() {
		System.out.println("i am haier tv");
	}

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("i am haier tv, i am opening");
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("i am haier tv, i am closing");
	}

}