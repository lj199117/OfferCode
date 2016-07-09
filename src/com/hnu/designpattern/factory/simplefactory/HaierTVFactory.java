package com.hnu.designpattern.factory.simplefactory;

public class HaierTVFactory extends TVFactory{
	public TV create(){
		return new HaierTV();
	}
}
