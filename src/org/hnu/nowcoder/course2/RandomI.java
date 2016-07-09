package org.hnu.nowcoder.course2;

/**
 * ��һ���ȸ���������1~5�������rand1To5���£�
public int rand1To5() {
return (int) (Math.random() * 5) + 1;
}
���֮�ⲻ��ʹ���κζ���������ƣ�����rand1To5ʵ�ֵȸ���������1~7�������rand1To7��


�������ԭ�Ͳ�����0-4  Ҳ����5���Ƶ���  ���Գ���5
 * @author LJ
 *
 */
public class RandomI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomI().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int num = 0;
		do {
			System.out.print(rand1To7()+"");
		} while (num++ < 20);
	}
	
	public int rand1To7(){
		int num = 0;
		do {
			num = (rand1To5() - 1) * 5 + rand1To5() - 1;
		} while (num > 20);
		return num % 7 + 1;
	}
	
	public int rand1To5() {
		return (int) (Math.random() * 5) + 1;
	}
}
