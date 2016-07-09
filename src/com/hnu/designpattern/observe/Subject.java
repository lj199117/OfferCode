package com.hnu.designpattern.observe;

public interface Subject {
	public void addActionListener(ActionListener actionListener);
	public void removeActionListener(ActionListener actionListener);
	public void notifyActionListeners(ActionEvent actionEvent);
}
