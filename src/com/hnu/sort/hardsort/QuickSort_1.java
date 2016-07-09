package com.hnu.sort.hardsort;

public class QuickSort_1 {

	public static void quickSort(long[] theArray) {
		int nElems = theArray.length;
		recQuickSort(theArray,0, nElems - 1);
//		displayData(theArray);
	}
	
	private static void displayData(long[] a) {
		for (int j = 0; j < a.length; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	
	public static void recQuickSort(long[] theArray, int left, int right) {
		if (right <= left) // if size <= 1,
			return; // already sorted
		else // size is 2 or larger
		{
			long pivot = theArray[left]; // rightmost item
										  // partition range
			int partition = partitionIt(theArray, left, right, pivot);
			
			recQuickSort(theArray, left, partition - 1); // sort left side
			recQuickSort(theArray, partition + 1, right); // sort right side
		}
		
	} // end recQuickSort()
	/**
	 * 对挖坑填数进行总结
	 * 1．left =L; right = R; 将基准数挖出形成第一个坑a[left]。--->pivot的形成
	 * 2．right--由后向前找比它小的数，找到后挖出此数填前一个坑a[left]中。--->交换
	 * 3．left++由前向后找比它大的数，找到后也挖出此数填到前一个坑a[right]中。--->交换
	 * 4．再重复执行2，3二步，直到left==right，将基准数填入a[left]中。
	 */
	public static int partitionIt(long[] theArray, int left, int right,long pivot) {
		int leftPtr = left; // right of first elem
		int rightPtr = right; // left of pivot
		while (leftPtr < rightPtr) {
			while (leftPtr < right && // find bigger than pivot item
					theArray[leftPtr] < pivot)
				leftPtr++; // (nop)

			while (rightPtr > left && // find smaller than pivot item
					theArray[rightPtr] > pivot)
				rightPtr--; // (nop)
			if(leftPtr < rightPtr){
				swap(theArray, leftPtr, rightPtr);
				leftPtr++;
				rightPtr--;
				System.out.println("分块结束，此时pivot="+pivot+",leftPtr="+leftPtr+",rightPtr="+rightPtr);
				displayData(theArray);
			}
		} 
		return leftPtr; // return partition
	}

	public static void swap(long[] theArray, int dex1, int dex2) // swap two elements
	{
		long temp;
		temp = theArray[dex1]; // A into temp
		theArray[dex1] = theArray[dex2]; // B into A
		theArray[dex2] = temp; // temp into B
	}
}
