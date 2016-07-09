package org.hnu.nowcoder.offer;

public class InversePairsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InversePairsClass().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,7,6,5};
		System.out.println(InversePairs(array));
	}
	public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return 0;
        if(array.length == 1) return 0;
        int sum = 0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j])
                    sum++;
            }
        }
        return sum;
    }
}
