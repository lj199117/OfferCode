package org.hnu.nowcoder.offer;

public class MultiplyClass {
	public static void main(String[] args) {
		new MultiplyClass().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5};
		int[] b = multiply(A);
		for(int i : b){
			System.out.println(i);
		}
	}
	public int[] multiply(int[] A) {
        if(A == null || A.length == 0) return null;
        int len = A.length;
        int[] b = new int[len];
        b[0] = 1;
        // �������ҽ�A[0]*A[1]*...*A[i-1]�Ľ������ȴ�������b[i]
        for (int i = 1; i < b.length; i++) {
            b[i] = b[i-1]*A[i-1];
        }
        int acc = 1;
        // �������󹹽�A[i+1]*A[i+2]*...*A[n-1]���۳˵�b[i]
        for (int j = b.length-2; j >=0 ; j--) {
            acc*=A[j+1];
            b[j] = acc*b[j];
        }
        return b;    
    }
}
