package org.hnu.nowcoder.course2;

public class MinNeedSortLength {
	public static void main(String[] args) {
		new MinNeedSortLength().run();
	}
	private void run() {
		int[] arr = {1,5,3,4,2,6,8};
//		int[] arr = {1,5,3,4,2,6,7};
		System.out.println(getMinLength(arr));
	}
	public int getMinLength(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		int min = arr[arr.length - 1];
		int noMinIndex = -1;
		for (int i = arr.length - 2; i != -1; i--) {
			//��Ӧ��minС��λ�� ȴ��min��  ��¼��λ��
			if (arr[i] > min) {
				noMinIndex = i;
			} else {
				//ǰ������minС,����min
				min = Math.min(min, arr[i]);
			}
		}
		if (noMinIndex == -1) {
			return 0;
		}
		int max = arr[0];
		int noMaxIndex = -1;
		for (int i = 1; i != arr.length; i++) {
			if (arr[i] < max) {
				noMaxIndex = i;
			} else {
				max = Math.max(max, arr[i]);
			}
		}
		System.out.println("max="+max+",maxIndex="+noMaxIndex+",min="+min+",minIndex="+noMinIndex);
		return noMaxIndex - noMinIndex + 1;
	}
}
