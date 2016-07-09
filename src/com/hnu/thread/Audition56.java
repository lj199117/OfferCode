package com.hnu.thread;

/**
 * ���߳�ѭ��10�Σ��������߳�ѭ��100�� 
 * �����ֻص����߳�ѭ��10�Σ������ٻص����߳���ѭ��100��
 * ���ѭ��50�Σ���д������
 * 
 * @author LJ
 * 
 */
public class Audition56 {
	public static void main(String[] args) {
		new Audition56().init();
	}

	public void init() {
		final Business business = new Business();
		//���߳�
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					business.SubThread(i);
				}
			}
		}).start();
		//���߳�
		for (int i = 0; i < 50; i++) {
			business.MainThread(i);
		}
	}
}

class Business {
	boolean bShouldSub = true;// �����൱�ڶ����˿��Ƹ�˭ִ�е�һ���źŵ�

	public synchronized void MainThread(int i) {
		if (bShouldSub)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (int j = 0; j < 5; j++) {
			System.out.println(Thread.currentThread().getName() + ":i=" + i
					+ ",j=" + j);
		}
		bShouldSub = true;
		this.notify();
	}

	public synchronized void SubThread(int i) {
		if (!bShouldSub)
			try {
				//���̵߳ȴ�
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName() + ":i=" + i
					+ ",j=" + j);
		}
		bShouldSub = false;
		//����ע��:���̲߳�ȥ�������߳�
		this.notify();
	}
}
