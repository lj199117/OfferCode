package com.hnu.sort.easysort;

public class BubbleSort {
	
	/**
	 * ÿһ�ζ���һ��������ð�������ڹ̶�λ��
	 * @param a
	 */
	public static void bubbleSort(long[] a) {
		int out, in, flag = 0;
		int nElems = a.length;
		for (out = nElems - 1; out > 0; out--){
			System.out.println("The "+(++flag)+"th bubbleSort");
			for (in = 0; in < out; in++){
				if (a[in] > a[in + 1]){
					swap(a, in, in + 1);
				}
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
