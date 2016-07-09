package com.hnu.sort.hardsort;

/**
 * �鲢������ʵҪ�������£� ��1�����ֽ⡱����������ÿ���۰뻮�֡� ��2�����ϲ������������ֺ�����ж������ϲ�������
 * 
 * @author LJ
 * 
 */
public class MergeSort {

	public static void sort(int a[], int first, int last) {
		Decompose(a, first, last);
		displayData(a);
	}

	private static void displayData(int[] a) {
		for (int j = 0; j < a.length; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	/**
	 * 1.�ֽ�����
	 * 
	 * @param a
	 * @param first
	 * @param last
	 */
	public static void Decompose(int a[], int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			System.out.println("first="+first+",last="+last+",mid="+mid);
			Decompose(a, first, mid); // �ֽ����
			Decompose(a, mid + 1, last); // �ֽ��ұ�
			MergeArray(a, first, mid, last); // �ٽ������������кϲ�
		}
		//System.out.println("first="+first+",last="+last);
	}

	/**
	 * 2.���ȿ�������ν��������������кϲ��� MergeArray() ���ж�����������a[first...mid]��a[mid...last]�ϲ���
	 * 
	 * @param a
	 * @param first
	 * @param mid
	 * @param last
	 */
	public static void MergeArray(int array[], int low, int mid, int high) {
		System.out.println("merge: low="+low+",mid="+mid+",high="+high);
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��
		int k = 0;

		// �ѽ�С�������Ƶ���������
		while (i <= mid && j <= high) {
			if (array[i] < array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}

		// �����ʣ�������������
		while (i <= mid) {
			temp[k++] = array[i++];
		}

		// ���ұ߱�ʣ�������������
		while (j <= high) {
			temp[k++] = array[j++];
		}

		// ���������е����nums����
		for (int k2 = 0; k2 < temp.length; k2++) {
			array[k2 + low] = temp[k2];
		}
	}

}
