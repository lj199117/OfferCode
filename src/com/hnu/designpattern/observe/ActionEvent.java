package com.hnu.designpattern.observe;

public class ActionEvent {
	Object source;
	int id;
	String command;
	public ActionEvent(Object source, int id, String command) {
        this.source = source;
        this.id=id;
        this.command = command;
    }
}
