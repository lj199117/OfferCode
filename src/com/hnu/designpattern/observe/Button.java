package com.hnu.designpattern.observe;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject{
	List<ActionListener> listeners = new ArrayList<ActionListener>();

	public void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		listeners.add(actionListener);
	}

	public void removeActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		listeners.remove(actionListener);
	}

	public void notifyActionListeners(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		for(ActionListener actionListener:listeners){
			actionListener.actionPerformed(actionEvent);
		}
	}

}
