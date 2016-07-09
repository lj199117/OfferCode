package com.hnu.array;

import com.hnu.array.util.Util;


/**
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * @author LJ
 *
 */
public class RotateArray {
	static int[] array = {1,2,3,4,5,6,7};
	
	public static void main(String[] args) {
		
		//directRotate(array, 3);
		
		//bubbleRotate(array, 3);
		
		recRotate(array,3);
		Util.displayData(array);
	}
	
	//method 1 In a straightforward way
	//����һ����,����for loop��result����result[i]
	public static void directRotate(int[] nums, int k) {
		if(k > nums.length) 
	        k=k%nums.length;
	 
	    int[] result = new int[nums.length];
	    
	    for(int i=0;i<k;i++){
	    	result[i] = nums[nums.length - k + i];
	    }
	    
	    int j=0;
	    for(int i=k;i<nums.length;i++,j++){
	    	result[i] = nums[j];
	    }
	    
	    System.arraycopy(result, 0, nums, 0, nums.length);
	}
	
	//method 2 :This solution is like a bubble sort.
	public static void bubbleRotate(int[] nums, int k) {
		for(int i=0;i<nums.length-k-1;i++){
			for(int j=nums.length-1;j>0;j--){
				Util.swap(nums, j, j-1);
			}
		}
	}
	
	//method 3:recursion
	/**
	 * 1. Divide the array two parts: 1,2,3,4 and 5, 6
	 * 2. Rotate first part: 4,3,2,1,5,6
	 * 3. Rotate second part: 4,3,2,1,6,5
	 * 4. Rotate the whole array: 5,6,1,2,3,4
	 * @param nums
	 * @param k
	 */
	public static void recRotate(int[] nums, int k) {
		reverse(nums, 0, k);
		reverse(nums, k+1, nums.length-1);
		reverse(nums, 0, nums.length-1);
	}
	
	private static void reverse(int[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
		while(left < right){
			Util.swap(arr, left, right);
			left ++;
			right --;
		}
	}
	
}
