package com.hnu.designpattern.observe;

public class ConcreateListener2 implements ActionListener{

	public void actionPerformed(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		System.out.println("ConcreateListener2执行"+actionEvent.command);
	}

}
