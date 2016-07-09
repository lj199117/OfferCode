package com.hnu.thread;

public class TestWait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Thread1()).start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(new Thread2()).start();
	}
}

class Thread1 implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		// ���������Thread1�������Thread2�ڲ�run����Ҫ��ͬһ������Ϊ��������
		//�������ﲻ����this����Ϊ��Thread2�����this�����Thread1��this����ͬһ������
		//������MultiThread.class����ֽ�����󣬵�ǰ������������������ʱ��ָ��Ķ���ͬһ������
		synchronized (TestWait.class) {
			System.out.println("enter thread1...");
			System.out.println("thread1 is waiting");
			try {
				//�ͷ��������ַ�ʽ����һ�ַ�ʽ�ǳ�����Ȼ�뿪�������ķ�Χ��
				//Ҳ�����뿪��synchronized�ؼ��ֹ�Ͻ�Ĵ��뷶Χ��
				//��һ�ַ�ʽ������synchronized�ؼ��ֹ�Ͻ�Ĵ����ڲ����ü����������wait������
				//���ʹ��wait�����ͷ���
				TestWait.class.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread1 is going on...");
			System.out.println("thread1 is being over!");
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		// TODO Auto-generated method stub
		synchronized (TestWait.class) {
			System.out.println("enter thread2...");
			System.out
					.println("thread2 notify other thread can release wait status..");
			// ����notify���������ͷ���ʹthread2���������sleep������Ϣ��10���룬
			//��thread1��Ȼ����ִ�У���Ϊthread2û���ͷ�������Thread1�޷��ò�����
			TestWait.class.notify();
			System.out.println("thread2 is sleeping 3 seconds...");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread2 is going on...");
			System.out.println("thread2 is being over!");
		}
	}
}
