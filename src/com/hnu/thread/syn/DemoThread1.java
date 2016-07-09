package com.hnu.thread.syn;

public class DemoThread1 extends Thread {
	private TargetMethod target = null;

	public DemoThread1(TargetMethod target) {
		this.target = target;
	}

	public void run() {
		target.objLockMethod1();
	}
}