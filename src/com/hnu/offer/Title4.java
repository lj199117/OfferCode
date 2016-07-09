package com.hnu.offer;

import java.util.*;

public class Title4 {
	public static char arr[] = null;  
	
	public static void main(String[] args) {
		new Title4().run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        arr = str.toCharArray();
        Arrays.sort(arr);
        perm(arr,0,arr.length-1);  
	}

	
	private static void swap(int i1, int i2) {
		char temp = arr[i2];
		arr[i2] = arr[i1];
		arr[i1] = temp;
	}
	
	public static void perm(char arr[], int begin,int end) {  
        if(end==begin){         //一到递归的出口就输出数组，此数组为全排列  
            for(int i=0;i<=end;i++){  
                System.out.print(arr[i]);  
            }  
            System.out.println();  
            return;  
        }  
        else{  
            for(int j=begin;j<=end;j++){   
                swap(begin,j);      //for循环将begin~end中的每个数放到begin位置中去  
                perm(arr,begin+1,end);  //假设begin位置确定，那么对begin+1~end中的数继续递归  
                swap(begin,j);      //换过去后再还原  
            }  
        }  
    }  

}
