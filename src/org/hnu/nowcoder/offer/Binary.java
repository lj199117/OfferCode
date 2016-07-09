package org.hnu.nowcoder.offer;

/**
 * ����ԭ��n&(n-1)���кܶ����á�
n&(n-1)���ã���n�Ķ����Ʊ�ʾ�е����λΪ1�ĸ�Ϊ0���ȿ�һ���򵥵����ӣ�
n = 10100(�����ƣ�����(n-1) = 10011 ==��n&(n-1) = 10000

n&n-1 ���n���ұߵ�1
n&-n ȡ��n���ұߵ�1
 * @author LJ
 *
 *1. ��ĳһ����Ķ����Ʊ�ʾ��1�ĸ���
while (n >0 ) {
      count ++;
      n &= (n-1);
}

2. �ж�һ�����Ƿ���2�ķ���
n > 0 && ((n & (n - 1)) == 0 )

 */
public class Binary {
	public static void main(String[] args) {
		int count = 0;
		int n = 12;
		while (n > 0) {
		      count ++;
		      n &= (n-1);
		}
		System.out.println(count);
		n = 8;
		System.out.println(n > 0 && ((n & (n - 1)) == 0 ));
	}
}
