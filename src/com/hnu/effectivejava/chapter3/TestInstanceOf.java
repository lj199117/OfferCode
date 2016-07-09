package com.hnu.effectivejava.chapter3;

public class TestInstanceOf {
	public static void main(String[] args) {
		System.out.println(new Son() instanceof Father);
		System.out.println(new Father() instanceof Son);
	}
}

class Father{
	
}

class Son extends Father{
	
}

