package com.hnu.sort.sortpratice;

//�в�����  ��������
public class ShellSortPractice {
	public static void main(String[] args) {
		int[] array = {49,38,65,97,76,13,27,49};
		shellSort(array);
	}
	
	public static void shellSort(int[] array){
		/*int nElems = array.length;
		int h = 1; // find initial value of h
		while (h <= nElems / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
		
		int j;
		while(h > 0){
			
			for(int i=h;i<nElems;i++){
				int cur = array[i];
				//�ԱȲ��ţ�����ط���j-h>=0  ���в��
				for(j=i;j-h>=0 && cur<array[j-h];j-=h){
					array[j] = array[j-h];
				}
				array[j] = cur;
			}
			h = (h - 1) / 3; // decrease h
			
			displayData(array);
		}*/
		
		int nElems = array.length;
		int h = 1; // find initial value of h
		while (h <= nElems / 3)
			h = h * 3 + 1;
		/*while(h>0){
			for(int i=h;i<array.length;i++){
				int cur = array[i];
				int j=i;
				//���������Ĳ����j-h����=0
				for(;j-h>=0 && array[j-h]>cur;j-=h){
					array[j] = array[j-h];
				}
				array[j] = cur;
			}
			h = h / 3;
		}*/
		
		
		while(h>0){
			for(int i=h;i<array.length;i++){
				int cur = array[i];
				int j=i;
				for(;j-i>=0 && array[j-h]>cur;j-=h)
					array[j] = array[j-h];
				array[j] = cur;
			}
			
			h = h/3;
		}
		
		displayData(array);
	}
	
	private static void displayData(int[] a){
		for(int j=0; j<a.length; j++)       // for each element,
	         System.out.print(a[j] + " ");  // display it
	      System.out.println("");
	}
}	
