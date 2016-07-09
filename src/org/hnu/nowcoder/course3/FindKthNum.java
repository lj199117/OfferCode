package org.hnu.nowcoder.course3;
/**
 * ��������������arr1��arr2���ڸ�һ������k����������������������е�KС����
���磺
arr1 = {1,2,3,4,5};
arr2 = {3,4,5};
K = 1;
��Ϊ1Ϊ����������С�ģ����Է���1��
arr1 = {1,2,3};
arr2 = {3,4,5,6};
K = 4;
��Ϊ3Ϊ�������е�4С�������Է���3��
Ҫ�����arr1�ĳ���ΪN��arr2�ĳ���ΪM��ʱ�临�Ӷ���ﵽO(log(min{M,N}))��

 * @author LJ
 *�ⷨ��
 *1.��� 1 <= K <= shortArr.length ��ô�������������ж�ȡǰK���� ����λ��(2K������ȡ��K����С����)����
 *2.��� longArr.length <= K �ø���
 *3.��� shortArr.length <= K <= longArr.length
 */
public class FindKthNum {
	public static int findKthNum(int[] arr1, int[] arr2, int kth) {
		if (arr1 == null || arr2 == null) {
			throw new RuntimeException("Your arr is invalid!");
		}
		if (kth < 1 || kth > arr1.length + arr2.length) {
			throw new RuntimeException("K is invalid!");
		}
		int[] longArr = arr1.length >= arr2.length ? arr1 : arr2;
		int[] shortArr = arr1.length < arr2.length ? arr1 : arr2;
		int lenL = longArr.length;
		int lenS = shortArr.length;
		if (kth <= lenS) {
			return getUpMedian(shortArr, 0, kth - 1, longArr, 0, kth - 1);
		}
		if (kth > lenL) {
			if (shortArr[kth - lenL - 1] >= longArr[lenL - 1]) {
				return shortArr[kth - lenL - 1];
			}
			if (longArr[kth - lenS - 1] >= shortArr[lenS - 1]) {
				return longArr[kth - lenS - 1];
			}
			return getUpMedian(shortArr, kth - lenL, lenS - 1, longArr, kth - lenS, lenL - 1);
		}
		if (longArr[kth - lenS - 1] >= shortArr[lenS - 1]) {
			return longArr[kth - lenS - 1];
		}
		return getUpMedian(shortArr, 0, lenS - 1, longArr, kth - lenS, kth - 1);
	}
	public static int getUpMedian(int[] arr1, int start1, int end1, int[] arr2,
			int start2, int end2) {
		if (start1 == end1) {
			return Math.min(arr1[start1], arr2[start2]);
		}
		int offset = ((end1 - start1 + 1) & 1) ^ 1;
		int mid1 = (start1 + end1) / 2;
		int mid2 = (start2 + end2) / 2;
		if (arr1[mid1] > arr2[mid2]) {
			return getUpMedian(arr1, start1, mid1, arr2, mid2 + offset, end2);
		} else if (arr1[mid1] < arr2[mid2]) {
			return getUpMedian(arr1, mid1 + offset, end1, arr2, start2, mid2);
		} else {
			return arr1[mid1];
		}
	}
}
