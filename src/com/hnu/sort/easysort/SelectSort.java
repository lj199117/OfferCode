package com.hnu.sort.easysort;

public class SelectSort {
	
	/**
	 * ÿһ�ζ�ѡ��һ�����(С)��������ǰ��λ�ý���,ǰ�����������
	 * @param a
	 */
	public static void selectSort(long[] a) {
		int out, in, min, flag = 0;
		int nElems = a.length;
		for (out = 0; out < nElems; out++){
			System.out.println("The "+(++flag)+"th selectSort");
			min = out;
			for (in = out+1; in < nElems; in++){
				if (a[in] > a[min])
					min = in;
				swap(a, in, out);
				displayData(a);
			}
		}
			
				
	}

	private static void swap(long[] a,int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	private static void displayData(long[] a){
		for(int j=0; j<a.length; j++)       // for each element,
	         System.out.print(a[j] + " ");  // display it
	      System.out.println("");
	}
}
