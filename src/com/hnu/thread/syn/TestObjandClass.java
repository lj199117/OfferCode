package com.hnu.thread.syn;

public class TestObjandClass {

	public static void main(String[] args) throws Exception {
		test2();
	}

	public static void test1() throws Exception {
		// �߳�5��ʼ����
		Thread t1 = new DemoThread5(new TargetMethod());
		t1.start();

		// ���߳�˯��100ms��,�ָ�ִ��,��ʱ�߳�1��Ȼ����˯��״̬
		Thread.sleep(100);
		System.out.println("main thread runnig....");

		// �߳�6���к�,˯��500ms
		Thread t2 = new DemoThread6();
		t2.start();
	}

	public static void test2() throws Exception {
		// �߳�6��ʼ����
		Thread t2 = new DemoThread6();
		t2.start();

		// ���߳�˯��100ms��,�ָ�ִ��,��ʱ�߳�1��Ȼ����˯��״̬
		Thread.sleep(100);
		System.out.println("main thread runnig....");

		// �߳�5
		Thread t1 = new DemoThread5(new TargetMethod());
		t1.start();
	}

}