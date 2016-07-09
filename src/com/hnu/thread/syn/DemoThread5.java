package com.hnu.thread.syn;

public class DemoThread5 extends Thread {
	private TargetMethod target = null;

	public DemoThread5(TargetMethod target) {
		this.target = target;
	}

	public void run() {
		target.objLockMethod1();
	}
}
