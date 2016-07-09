package com.hnu.designpattern.adapter.objectadapter;

public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
	
	public void sampleOperation2() {
		System.out.println("Adapter - sampleOperation2");	
	}
	/**
	 * 直接委派方法
	 */
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}
}
