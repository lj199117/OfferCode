package com.hnu.thread.syn;

public class TestClassSyn {

	public static void main(String[] args) throws Exception {
		//����ĵ�һ����ʽ �߳�3���к�,˯��5000ms
		Thread t1 = new DemoThread3();
		t1.start();

		// ���߳�˯��100ms��,�ָ�ִ��,��ʱ�߳�1��Ȼ����˯��״̬
		Thread.sleep(100);
		System.out.println("main thread runnig....");

		//����ĵڶ�����ʽ �߳�4��ʼ����,˯��500ms
		Thread t2 = new DemoThread4(new TargetMethod());
		t2.start();
	}

}
