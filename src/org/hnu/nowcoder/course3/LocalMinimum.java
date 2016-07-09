package org.hnu.nowcoder.course3;
/**
 * 1.����ֲ���С�ĸ��arr����Ϊ1ʱ��arr[0]�Ǿֲ���С��arr�ĳ���ΪN(N>1)ʱ�����
arr[0]<arr[1]����ôarr[0]�Ǿֲ���С�����arr[N-1]<arr[N-2]����ôarr[N-1]�Ǿֲ�
��С�����0<i<N-1������arr[i]<arr[i-1]����arr[i]<arr[i+1]����ôarr[i]�Ǿֲ���С��
����������arr����֪arr�������������ڵ�����ȣ�дһ������ֻ�践��arr����
��һ���ֲ���С���ֵ�λ�ü��ɡ�
 * @author LJ
 *
 *ʹ�ö��ַ���˼��
 */
public class LocalMinimum {
	public static void main(String[] args) {
		new LocalMinimum().run();
	}
	private void run() {
		int[] array={5,-3,-2,1,4,6};
		System.out.println(getLocalMinimumPos(array));
	}
	public int getLocalMinimumPos(int[] arr){
		if (arr == null || arr.length == 0) {
			return -1; // no exist
		}
		if (arr.length == 1 || arr[0] < arr[1]) {
			return 0;
		}
		if (arr[arr.length - 1] < arr[arr.length - 2]) {
			return arr.length - 1;
		}
		int left = 1;
		int right = arr.length - 2;
		int mid = 0;
		while (left < right) {
			mid = (left + right) / 2;
			if (arr[mid] > arr[mid - 1]) {
				right = mid - 1;
			} else if (arr[mid] > arr[mid + 1]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return left;//Attention  
	}
}
