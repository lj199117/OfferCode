package org.hnu.nowcoder.course1;

/**
 * ��ӡ���������и������ ����һ�� ����(NΪ���鳤��)
 * @author LJ
 * ���������һ��  �� ֻ��һ����һ��ɾ��������ͬ�������ֻ��һ�����˾�����,��Ϊ�������ȥ����(times--)
 * �����Ҫ��֤ �� 1 2 3 �ҵ�3 ����������һ��
 * 
 * �ҵ�������ͬ����  ͳһȫ��ɾ��
 */
public class PrintHalfMajor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintHalfMajor().run();
	}
	private void run() {
		int[] arr = {1,2,1,3,1,1,2,1};
		printHalfMajor(arr);
	}
	public void printHalfMajor(int[] arr){
		int cand = 0;
		int times = 0;
		for(int i= 0;i<arr.length;i++){
			if(times == 0){
				cand = arr[i];
				times = 1;
			}else if(cand == arr[i]){
				times ++;
			}else{
				//�൱��һ��ɾ����,������ͬ��������Գ�
				times --;
			}
		}
		//��֤�Ƿ�����Ǵ���һ�����
		times = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == cand){
				times ++;
			}
		}
		if(times > arr.length / 2){
			System.out.println(cand);
		}else System.out.println("no such num");
	}
}
