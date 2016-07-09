package com.hnu.sort.sortpratice;


public class InsertSortPractice {
	public static void main(String[] args) {
		int[] array = {49,38,65,97,76,13,27,49};
		insertSort(array);
	}
	
	
	//��ѡ������ͬ���ǣ�ѡ����������δ�������Ҫ����Сֵ������������ÿ���Ǵ���δ�����еĵ�һ��Ԫ�أ�����Ƭ��ѭ�����ƣ�ֱ��������ȷλ��
	//���������� &&
	public static void insertSort(int[] arr){
		/*int j;
		int flag = 0;
		for(int i=0;i<arr.length;i++){
			//��ǰ�����Ԫ��
			int cur = arr[i];
			flag = i;
			//���ɣ������&&  ��ô��Ҫ��һ��flag������¼, ���ɼ�insertSort1�ķ�ʽ
			for(j=i;j>=0;j--){
				if(cur < arr[j]){
					flag = j;
					arr[j+1] = arr[j];
				}
			}
			arr[flag] = cur;
			
			displayData(arr);
		}*/
		
		//Ϊ�˺�shellSort�е�˼��һ�£����Ǵ�i=1��λ�ÿ�ʼ����,Ȼ��j-1>=0(����j>0��ʵҲ��,Ϊ�����shell��j-h>=0)
		/*for(int i=1;i<arr.length;i++){
			int cur = arr[i];
			int j=i;
			for(;j-1>=0 && arr[j-1] > cur;j--){
				arr[j] = arr[j-1];
			}
			arr[j] = cur;
		}*/
		
		
		for(int i=1;i<arr.length;i++){
			int cur = arr[i];
			int j=i;
			for(;j>0 && arr[j-1] > cur;j--){
				arr[j] = arr[j-1];
			}
			arr[j] = cur;
		}
		displayData(arr);
	}
	
	public static void insertSort1(int[] a){
		int out, in, flag = 0;
		int nElems = a.length;
		//�ӵڶ���Ԫ�ر���
		for (out = 1; out < nElems; out++) // out is dividing line,the Ordered array length
		{
			
			//��ǰ�����Ԫ��
			int temp = a[out]; // remove marked item
			//С�ڵ�ǰ������������ֵ,ѭ������
			for(in = out;in > 0 && a[in - 1] >= temp; in--)// until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				//displayData(a);
			}
				
			a[in] = temp; // insert marked item
			displayData(a);
		}
	}
	
	
	private static void displayData(int[] a){
		for(int j=0; j<a.length; j++)       // for each element,
	         System.out.print(a[j] + " ");  // display it
	      System.out.println("");
	}
}
