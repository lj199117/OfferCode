package com.hnu.designpattern.observe;


public class AppClient {
	public static void main(String[] args) {
		Button button = new Button();
		button.addActionListener(new ConcreateListener1());
		button.addActionListener(new ConcreateListener2());
		
		button.notifyActionListeners(new ActionEvent(new Object(), 0, "Click"));
	}
}
