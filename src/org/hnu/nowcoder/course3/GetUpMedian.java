package org.hnu.nowcoder.course3;
/**
 * ��������������arr1��arr2���������鳤�ȶ�ΪN�������������������������λ��
���磺
arr1 = {1,2,3,4};
arr2 = {3,4,5,6};
һ��8����������λ���ǵ�4�������Է���3��
arr1 = {0,1,2};
arr2 = {3,4,5};
һ��6����������λ���ǵ�3�������Է���2��
Ҫ��ʱ�临�Ӷ�O(logN)
 * @author LJ
 *
 *��ʵ�Ƕ��ַ�
 */
public class GetUpMedian {
	public static int getUpMedian(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
			throw new RuntimeException("Your arr is invalid!");
		}
		return findProcess(arr1, 0, arr1.length - 1, arr2, 0, arr2.length - 1);
	}
	public static int findProcess(int[] arr1, int start1, int end1, int[] arr2,
			int start2, int end2) {
		if (start1 == end1) {
			return Math.min(arr1[start1], arr2[start2]);
		}
		// Ԫ�ظ���Ϊ������offsetΪ0��Ԫ�ظ���Ϊż����offsetΪ1��
		int offset = ((end1 - start1 + 1) & 1) ^ 1;
		int mid1 = (start1 + end1) / 2;
		int mid2 = (start2 + end2) / 2;
		if (arr1[mid1] > arr2[mid2]) {
			return findProcess(arr1, start1, mid1, arr2, mid2 + offset, end2);
		} else if (arr1[mid1] < arr2[mid2]) {
			return findProcess(arr1, mid1 + offset, end1, arr2, start2, mid2);
		} else {
			return arr1[mid1];
		}
	}
}
