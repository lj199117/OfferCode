package org.hnu.nowcoder.course2;
/**
 * ����leftMax��rightMax֮��ľ��ֵ
 * ��һ������ΪN(N>1)����������arr�����Ի��ֳ������������֣��󲿷�arr[0..K]���Ҳ���arr[K+1..N-1]��
 * K����ȡֵ�ķ�Χ��[0,N-2]������ô�໮�ַ����У��󲿷��е����ֵ��ȥ�Ҳ������ֵ�ľ��ֵ������Ƕ��٣�
 * 
 * ע�� ���Ǹ���K��λ�ý��л���
 * @author LJ
 *
 */
public class MaxLeftSubMaxRight {
	
	
	/**
	 * ����һ��ʱ�临�Ӷ�O(N^2)������ռ临�Ӷ�O(1)��������ķ������������ÿ��λ��(i)����һ�����ֻ��֣�
	 * �ҵ�arr[0..i]�����ֵmaxLeft���ҵ�arr[i+1..N-1]�����ֵmaxRight��Ȼ���������ֵ����ľ��ֵ��
	 * ÿ�λ��ֶ�������һ�Σ���Ȼ���Եõ���������ľ��ֵ��������ο����´����е�maxABS1������
	 * @param arr
	 * @return
	 */

	public int maxABS1(int[] arr) {
		int res = Integer.MIN_VALUE;
		int maxLeft = 0;
		int maxRight = 0;
		for (int i = 0; i != arr.length - 1; i++) {
			maxLeft = Integer.MIN_VALUE;
			for (int j = 0; j != i + 1; j++) {
				maxLeft = Math.max(arr[j], maxLeft);
			}
			maxRight = Integer.MIN_VALUE;
			for (int j = i + 1; j != arr.length; j++) {
				maxRight = Math.max(arr[j], maxRight);
			}
			res = Math.max(Math.abs(maxLeft - maxRight), res);
		}
		return res;
	}
	
	/**
	 * �м��õ���������һ�ֳ��õļ��ɣ�Ԥ����
	 * 
	 * ��������ʱ�临�Ӷ�O(N)������ռ临�Ӷ�O(N)��ʹ��Ԥ��������ķ�����
	 * �ȴ����ұ���һ�����lArr��lArr[i]��ʾarr[0..i]�е����ֵ��
	 * �ٴ��ҵ������һ�����rArr��rArr[i]��ʾarr[i..N-1]�е����ֵ��
	 * ���һ�α������ֻ��ֵ�����¿��Եõ���������������ľ��ֵ��
	 * ��ΪԤ���������Ѿ����������л��ֵ�maxֵ�����Թ�̵õ��˼��١�������ο����´����е�maxABS2������
	 * @param arr
	 * @return
	 */

	public int maxABS2(int[] arr) {
		int[] lArr = new int[arr.length];
		int[] rArr = new int[arr.length];
		lArr[0] = arr[0];
		rArr[arr.length - 1] = arr[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			lArr[i] = Math.max(lArr[i - 1], arr[i]);
		}
		for (int i = arr.length - 2; i > -1; i--) {
			rArr[i] = Math.max(rArr[i + 1], arr[i]);
		}
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			max = Math.max(max, Math.abs(lArr[i] - rArr[i + 1]));
		}
		return max;
	}


	/**
	 * ���������Ž⣬ʱ�临�Ӷ�O(N)������ռ临�Ӷ�O(1)���������arr�����ֵmax��
	 * ��Ϊmax��ȫ�����ֵ�����Բ�����ô���֣�maxҪô���Ϊ�󲿷ֵ����ֵ��Ҫô���Ϊ�Ҳ��ֵ����ֵ��
	 * ���max��Ϊ�󲿷ֵ����ֵ������������ֻҪ���Ҳ��ֵ����ֵ����С�Ϳ����ˡ��Ҳ��ֵ����ֵ��ô����С�أ�
	 * �Ҳ���ֻ����arr[N-1]��ʱ����Ǿ���С��ʱ��ͬ�?���max��Ϊ�Ҳ��ֵ����ֵ��ֻҪ���󲿷ֵ����ֵ����С�Ϳ����ˣ�
	 * �󲿷�ֻ����arr[0]��ʱ����Ǿ���С��ʱ�������������̻����쳣�򵥣�������ο����´����е�maxABS3������
	 * @param arr
	 * @return
	 */
	public int maxABS3(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max - Math.min(arr[0], arr[arr.length - 1]);
	}
}
