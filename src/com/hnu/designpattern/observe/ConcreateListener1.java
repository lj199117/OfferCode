package com.hnu.designpattern.observe;

public class ConcreateListener1 implements ActionListener{

	public void actionPerformed(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		System.out.println("ConcreateListener1执行"+actionEvent.command);
	}

}
