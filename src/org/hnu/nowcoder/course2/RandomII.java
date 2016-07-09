package org.hnu.nowcoder.course2;

/**
��һ����p���ʲ���0����1-p���ʲ���1�������rand01p���£�
public int rand01p() {
// you can change p as you like
double p = 0.83;
return Math.random() < p ? 0 : 1;
}
���֮�ⲻ��ʹ���κζ���������ƣ�����rand01pʵ�ֵȸ���������1~6�������rand1To6��


�仯����ԭ�Ͳ�����0-1  Ҳ����2���Ƶ���  Ϊ����0-5����  ���Գ���5
 * @author LJ
 *
 */
public class RandomII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomII().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int num = 0;
		do {
			System.out.print(rand1To6()+" ");
		} while (num++ < 20);
	}
	
	//1.�ȵȸ��ʲ���0 1    Ҳ����2����  ��һ�� *2   ����0 or 1�ĸ��ʲ�һ��  ���ǲ���01 10�ĸ���ȴ��һ���
	public int rand0To1(){
		int bit1;
		int bit2;
		do{
			bit1 = rand01p();
			bit2 = rand01p();
		}while(bit1 == bit2);
		
		return bit1 == 0 ? 0 : 1;
	}
	//2.����ȸ��ʵ�0-3����  Ҳ����4����  ��һ�� *4
	public int rand0To3() {
		return rand0To1() * 2 + rand0To1();
	}
	//3.���
	public int rand1To6() {
		int num = 0;
		do {
			num = rand0To3() * 4 + rand0To3();
		} while (num > 11);
		return num % 6 + 1;
	}
	public int rand01p() {
		// you can change p as you like
		double p = 0.83;
		return Math.random() < p ? 0 : 1;
	}
}
