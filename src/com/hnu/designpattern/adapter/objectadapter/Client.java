package com.hnu.designpattern.adapter.objectadapter;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee()); 
		target.sampleOperation1();
		target.sampleOperation2();
	}
}
