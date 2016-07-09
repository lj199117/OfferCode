package com.hnu.sort.sortpratice;

public class SelectSortPratice {
	public static void main(String[] args) {
		int[] array = {3,1,5,7,2,4,9,6};
		selectSort(array);
	}
	//��δ�����������С�ĺ�δ�����Ƭ������ǰλ�ý���
	public static void selectSort(int[] arr){
		/*for(int i=0;i<arr.length;i++){
			//����Сֵλ��
			int minPos = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minPos] > arr[j])
					minPos = j;
			}
			//�����ҵ���Сֵ����н��� ����swap���ڵ�һ��ѭ����
			swap(arr, i, minPos);
			
			displayData(arr);
		}*/
		
		
		/*for(int i=0;i<arr.length;i++){
			int min = i;
			for(int j=i;j<arr.length;j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			swap(arr, min, i);
		}*/
		
		
		for(int i=0;i<arr.length;i++){
			int minIndex = i;
			int j=i;
			for(;j<arr.length;j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
		displayData(arr);
	}
	private static void swap(int[] a,int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	private static void displayData(int[] a){
		for(int j=0; j<a.length; j++)       // for each element,
	         System.out.print(a[j] + " ");  // display it
	      System.out.println("");
	}
}
