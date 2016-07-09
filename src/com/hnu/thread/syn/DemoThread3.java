package com.hnu.thread.syn;

public class DemoThread3 extends Thread {

	public DemoThread3() {

	}

	public void run() {
		TargetMethod.classLock1();
	}
}
