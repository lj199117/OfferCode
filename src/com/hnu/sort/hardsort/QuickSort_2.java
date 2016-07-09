package com.hnu.sort.hardsort;

public class QuickSort_2 {

	public static void quickSort(long[] theArray) {
		int nElems = theArray.length;
		recQuickSort(theArray, 0, nElems - 1);
		System.out.println("分块里面少于10个数后用的插入排序了");
		displayData(theArray);
		// insertionSort(0, nElems-1); // the other option
	}

	public static void recQuickSort(long[] theArray, int left, int right) {
		int size = right - left + 1;
		if (size < 10) // insertion sort if small
			insertionSort(theArray, left, right);
		else // quicksort if large
		{
			long median = medianOf3(theArray, left, right);
			int partition = partitionIt(theArray, left, right, median);
			recQuickSort(theArray, left, partition - 1);
			recQuickSort(theArray, partition + 1, right);
		}
	} // end recQuickSort()

	public static void insertionSort(long[] theArray, int left, int right) {
		int in, out;
		// sorted on left of out
		for (out = left + 1; out <= right; out++) {
			long temp = theArray[out]; // remove marked item
			in = out; // start shifts at out
						// until one is smaller,
			while (in > left && theArray[in - 1] >= temp) {
				theArray[in] = theArray[in - 1]; // shift item to right
				--in; // go left one position
			}
			theArray[in] = temp; // insert marked item
		} // end for
	} // end insertionSort()

	public static long medianOf3(long[] theArray, int left, int right) {
		int center = (left + right) / 2;
		// order left & center
		if (theArray[left] > theArray[center])
			swap(theArray, left, center);
		// order left & right
		if (theArray[left] > theArray[right])
			swap(theArray, left, right);
		// order center & right
		if (theArray[center] > theArray[right])
			swap(theArray, center, right);

		swap(theArray, center, right - 1); // put pivot on right
		return theArray[right - 1]; // return median value
	} // end medianOf3()

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
	private static void displayData(long[] a) {
		for (int j = 0; j < a.length; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	
	public static void swap(long[] theArray, int dex1, int dex2) // swap two
																	// elements
	{
		long temp;
		temp = theArray[dex1]; // A into temp
		theArray[dex1] = theArray[dex2]; // B into A
		theArray[dex2] = temp; // temp into B
	}
}
