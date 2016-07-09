package com.hnu.sort.easysort;

public class InsertSort {

	/**
	 * ��ǰ�浱�����������,ѭ��������,�ҵ����ʵ�λ�ò������
	 * @param a
	 */
	public static void insertSort(long[] a) {
		int out, in, flag = 0;
		int nElems = a.length;

		for (out = 1; out < nElems; out++) // out is dividing line,the Ordered array length
		{
			System.out.println("The "+(++flag)+"th insertSort");
			long temp = a[out]; // remove marked item
			for(in = out;in > 0 && a[in - 1] >= temp; --in)// until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				//displayData(a);
			}
				
			a[in] = temp; // insert marked item
			displayData(a);
		}

	}

	private static void displayData(long[] a) {
		for (int j = 0; j < a.length; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
}
