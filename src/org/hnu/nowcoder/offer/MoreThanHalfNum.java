package org.hnu.nowcoder.offer;

public class MoreThanHalfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoreThanHalfNum().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(array));
	}
	public int MoreThanHalfNum_Solution(int [] array) {
		if(array == null) return 0;
		if(array.length == 1) return array[0];
		int cand = 0;
		int times = 0;
		int i = array.length - 1;
		while(i-- > 0){
			if(times == 0){
				cand = array[i];
				times = 1;
			}else
			if(array[i] == cand){
				times ++;
			}else{
				times --;
			}
		}
		//��֤�����ǲ���һ��
		int num = 0;
		for(int j=0;j<array.length;j++){
			if(array[j] == cand)
				num++;
		}
        return num > array.length / 2 ? cand : 0;
    }
}
