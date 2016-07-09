package com.hnu.thread.syn;

public class TargetMethod {
	// ��������ʽ1
	public synchronized void objLockMethod1() {
		System.out.println("in...objLockMethod1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("out...objLockMethod1");
	}

	// ��������ʽ2
	public void objLockMethod2() {
		synchronized (this) {
			System.out.println("in...objLockMethod2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("out...objLockMethod2");
		}

	}

	// ������ʽ1
	public static synchronized void classLock1() {
		System.out.println("classLock1------in");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("classLock1------out");
	}

	// ������ʽ2
	public void classLock2() {
		synchronized (TargetMethod.class) {
			System.out.println("classLock2------in");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("classLock2------out");
		}

	}

}