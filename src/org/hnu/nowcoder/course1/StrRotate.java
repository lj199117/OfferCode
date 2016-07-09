package org.hnu.nowcoder.course1;

public class StrRotate {
	public static void main(String[] args) {
		new StrRotate().run();
	}

	private void run() {
		String str = "abcdefghijk";
		rotate(str.toCharArray(),5);
	}
	
	public static void rotate(char[] chars, int k) {
		//�������
		reverse(chars, 0, k);
		//�������
		reverse(chars, k+1, chars.length-1);
		//ǰ������
		reverse(chars, 0, chars.length-1);
		StringBuffer sb = new StringBuffer().append(chars);
		System.out.println(sb.toString());
	}
	
	private static void reverse(char[] arr, int left, int right){
		if(arr == null || arr.length == 1) 
			return;
		while(left < right){
			swap(arr, left, right);
			left ++;
			right --;
		}
	}

	private static void swap(char[] arr, int left, int right) {
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
