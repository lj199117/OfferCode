package com.hnu.thread.syn;

public class DemoThread4 extends Thread {
	private TargetMethod target = null;

	public DemoThread4(TargetMethod target) {
		this.target = target;
	}

	public void run() {
		target.classLock2();
	}
}
