package com.hnu.sort.sortpratice;



public class QuickSortPratice {
	static int[] array = {6,1,2,7,9,3,4,5,10,8};
	
	public static void main(String[] args) {
		quickSort(array);

	}
	public static void quickSort(int[] theArray) {
		int nElems = theArray.length;
		quickSort(theArray,0, nElems - 1);
	}

	private static void quickSort(int[] theArray, int left, int right) {
		if(left > right) return;
		int leftPos = left;
		int rightPos = right;
		int pivot = theArray[left];
		/*while(leftPos < rightPos){
			while(leftPos < rightPos && theArray[rightPos] >= pivot) rightPos--;
			while(leftPos < rightPos && theArray[leftPos] <= pivot) leftPos++;
			
			if(leftPos < rightPos){
				//����,��Ϊ������while����>= <=����,����ֻ�ý��� ����rightPos --;leftPos ++;
				swap(theArray, leftPos, rightPos);
//				rightPos --;
//				leftPos ++;
			}
		}
		//�˴ο��Ž���,��׼���λ,��׼��ﵽ����λ��
		theArray[left] = theArray[leftPos];//��Ϊ��׼��ȡ����������,����׼��ȡ�м��,��ôһ�����Ͱ��м�ĺ������Ľ�������
		theArray[leftPos] = pivot;*/
		
		
		while(leftPos < rightPos){
			while(leftPos<rightPos && theArray[rightPos] >= pivot) rightPos--;
			while(leftPos<rightPos && theArray[leftPos] <= pivot) leftPos++;
			
			if(leftPos < rightPos){
				swap(theArray, leftPos, rightPos);
			}
			
		}
		theArray[left] = theArray[leftPos];
		theArray[leftPos] = pivot;
		
		
		System.out.println("pivot="+pivot+"");
		displayData(theArray);
		
		quickSort(theArray,left,leftPos-1);
		quickSort(theArray,leftPos+1,right);
	}

	public static void swap(int[] theArray, int dex1, int dex2) // swap two elements
	{
		int temp;
		temp = theArray[dex1]; // A into temp
		theArray[dex1] = theArray[dex2]; // B into A
		theArray[dex2] = temp; // temp into B
	}
	private static void displayData(int[] a) {
		for (int j = 0; j < a.length; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
}
