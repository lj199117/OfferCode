package com.hnu.thread.syn;

public class TestObjSyn {

	public static void main(String[] args) throws Exception {
//		test1();
		test2();
	}

	public static void test1() throws Exception {
		// �����������ͬ�Ķ��� Ҳ�����̲߳�������ݹ���(���Լ�����Ч)
		TargetMethod target1 = new TargetMethod();
		TargetMethod target2 = new TargetMethod();

		//������ĵ�һ����ʽ �߳�1���к�,˯��5000ms
		Thread t1 = new DemoThread1(target1);
		t1.start();

		// ���߳�˯��100ms��,�ָ�ִ��,��ʱ�߳�1��Ȼ����˯��״̬
		Thread.sleep(100);
		System.out.println("main thread runnig....");

		//������ĵڶ�����ʽ �߳�2��ʼ���� ˯��500ms,��Ϊ���������� �����t1ִ�������ִ��
		Thread t2 = new DemoThread2(target2);
		t2.start();
	}

	public static void test2() throws Exception {
		//��test1 ���  ֻ�����һ������ �̹߳�����һ������
		TargetMethod shared = new TargetMethod();
		//������ĵ�һ����ʽ �߳�1���к�,˯��5000ms
		Thread t1 = new DemoThread1(shared);
		t1.start();

		Thread.sleep(100);
		System.out.println("main thread runnig....");
		//������ĵڶ�����ʽ �߳�2��ʼ���� ˯��500ms,��Ϊ����һ������ ���ò����� �����t1ִ�������ִ��
		Thread t2 = new DemoThread2(shared);
		t2.start();
	}
}
