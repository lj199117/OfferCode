package com.hnu.designpattern.adapter.classadapter;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(); 
		target.sampleOperation1();
		target.sampleOperation2();
	}
}
