package org.hnu.nowcoder.offer;

import java.util.Hashtable;

/**
 * ����������Ԫ���Ƿ�ֻ������һ��
 * @author LJ
 *
 */
public class Hash {
	public static void main(String[] args) {
		//int[] a = {1,2,3,4,2,4,5,1,9};
		int[] a = {1,2,3,4,5,6,7,88,9};
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!hash.containsKey(a[i])) { // �����޴˵���
				hash.put(a[i], 1);
			} else {//����У����ڽ������1
				hash.put(a[i],hash.get(a[i])+1 );
				System.out.println(false);
				break;
			}
		}
		System.out.println(true);
	}
}
