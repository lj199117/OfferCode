package com.hnu.sort.hardsort;


public class AppClient {
	static long[] array = {12,11,9,3,8,6,5,4,3,2,1};
	
	public static void main(String[] args) {
		
//		ShellSort.shellSort(array);
		
		QuickSort_1.quickSort(array);
		//QuickSort_2.quickSort(array);
	}
	
}

