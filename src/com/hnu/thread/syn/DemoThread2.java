package com.hnu.thread.syn;

public class DemoThread2 extends Thread {
	private TargetMethod target = null;

	public DemoThread2(TargetMethod target) {
		this.target = target;
	}

	public void run() {
		target.objLockMethod2();
	}
}
