package org.hnu.nowcoder.offer;

import java.util.Scanner;

public class Sort01 {
	
	public static void main(String[] args) {
		new Sort01().run();
	}
	
	private void run() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testNum = scan.nextInt();
		while(testNum-- > 0){
			String str = scan.next();
			System.out.println(this.sortCount(str));
		}
		
	}

	public int sortCount(String str){
		int count = 0;
		char[] cArray = str.toCharArray();
		int low=0,high = cArray.length-1;
		while(low < high){
			while(cArray[low]=='0'){
				low++;
			}
			while(cArray[high]=='1'){
				high--;
			}
			if(low < high && swap(cArray, low, high)){
				count++;
				low++;
				high--;
			}
				
		}
		return count;
	}
	public boolean swap(char[] cArray,int low,int high){
		char temp;
		temp = cArray[low];
		cArray[low] = cArray[high];
		cArray[high] = temp;
		return true;
	}
}
