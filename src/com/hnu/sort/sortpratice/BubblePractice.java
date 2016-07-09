package com.hnu.sort.sortpratice;

public class BubblePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,6,8,5,4,7,6};
		bubble(array);
	}
	public static void bubble(int[] array){
		/*for(int i=0;i<array.length;i++){
			//ÿ������� ����λ�þ͹̶���
			for(int j=1;j<array.length - i;j++){
				if(array[j-1] > array[j])
					swap(array,j,j-1);
			}
			displayData(array);
		}*/
		
		//���Java�Ż���� ����ѭ��Ҫ����С ����Ϊ����
		/*for(int i=array.length;i>0;i--){
			//ÿ������� ����λ�þ͹̶���
			for(int j=1;j<i;j++){
				if(array[j-1] > array[j])
					swap(array,j,j-1);
			}
		}*/
		
		for(int i=array.length-1;i>0;i--)
			for(int j=0;j<i;j++){
				if(array[j] > array[j+1])
					swap(array, j, j+1);
			}
		
		
		displayData(array);
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
