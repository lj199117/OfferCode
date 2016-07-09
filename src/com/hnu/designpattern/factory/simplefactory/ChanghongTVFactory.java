package com.hnu.designpattern.factory.simplefactory;

public class ChanghongTVFactory extends TVFactory{
	public TV create(){
		return new ChanghongTV();
	}
}
