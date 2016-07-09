package com.hnu.sort.hardsort;

public class ShellSort {
	/**
	 * 借鉴插入排序,在一个h区段上的多个数并不是在一次循环就像insertSort把多个数排序好了
	 * 内层的循环是两个数比较而已
	 * @param theArray
	 */
	public static void shellSort(long[] theArray) {
		int inner, outer, flag = 0;
		long temp;
		int nElems = theArray.length;
		int h = 1; // find initial value of h
		while (h <= nElems / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)

		while (h > 0) // decreasing h, until h=1
		{
			System.out.println("The "+(++flag)+"th shellSort,h="+h);
			// h-sort the file
			for (outer = h; outer < nElems; outer++) {
				temp = theArray[outer];
				// one subpass (eg 0, 4, 8)
				for (inner = outer;inner > h - 1 && theArray[inner - h] >= temp;inner -= h) {
					theArray[inner] = theArray[inner - h];
				}
				theArray[inner] = temp;
				displayData(theArray);
			}
			h = (h - 1) / 3; // decrease h
		}
	}
	
	private static void displayData(long[] a) {
		for (int j = 0; j < a.length; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
}
