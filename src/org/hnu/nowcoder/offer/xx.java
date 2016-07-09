package org.hnu.nowcoder.offer;

public class xx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new xx().run();
		System.out.println(new xx().Sum_Solution(1));
	}
	public int Sum_Solution(int n) {
        return n == 0 ? 0 : n + Sum_Solution(n-1);
    }
	private void run() {
		
		// TODO Auto-generated method stub
		int[] a = {1,2,34,5};
		int[] b = (int [])a.clone();
		method(a,b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");
		}
	}

	private void method(int[] a,int[] b) {
		// TODO Auto-generated method stub
		a[2] = 100;
	}
	
}
