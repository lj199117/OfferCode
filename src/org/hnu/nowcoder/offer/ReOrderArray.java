package org.hnu.nowcoder.offer;

import java.util.Arrays;

/**
 * ����һ���������飬ʵ��һ����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤���������ż���ż��֮������λ�ò���
 * @author LJ
 *
 */
public class ReOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReOrderArray().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] array = {6,5,3,8,4,9,7};
		reOrderArray(array);
		System.out.println(Arrays.toString(array));
	}
	/**
	 * ���ò��������˼��
	 * @param array
	 */
	public void reOrderArray(int [] array) {
		int i,j;
        for(i=1;i<array.length;i++){
        	int temp = array[i];
        	//temp��������ѭ������
        	for(j=i;j > 0 && array[j-1]%2 == 0 && temp%2 == 1;--j){
        		array[j] = array[j-1];
        	}
        	array[j] = temp;
        }
    }
}
