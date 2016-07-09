package com.hnu.effectivejava.chapter4.article18;

public class Test {
	public static void main(String[] args) {
		SubClass fb = new SubClass();
		fb.setVal("val");
		System.out.println(fb.getVal());
		fb.baseMethodA();
	}
}
