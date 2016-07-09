package com.hnu.thread.syn;

public class DemoThread6 extends Thread {
	public DemoThread6() {
	}

	public void run() {
		TargetMethod.classLock1();
	}
}
