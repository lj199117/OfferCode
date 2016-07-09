package com.hnu.array.util;

public class Util {
	public static void swap(int[] a,int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	public static void displayData(int[] a){
		for(int j=0; j<a.length; j++)       // for each element,
	         System.out.print(a[j] + " ");  // display it
	      System.out.println("");
	}
}
