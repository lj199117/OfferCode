package org.hnu.nowcoder.offer;
/**
 * ��Ŀ����
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ���������������һ����ά�����һ�������ж��������Ƿ��и�����
 * @author LJ
 *
 */
public class Array2DSearch {
	public static void main(String[] args) {
		new Array2DSearch().run();
		
	}
	
	private void run() {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(Find(array, 5));
	}

	/**
	 *  ����������ģ������½��������������ֵݼ����������ֵ�����
	 * ��˴����½ǿ�ʼ���ң���Ҫ�������ֱ����½����ִ�ʱ������
	 * Ҫ�������ֱ����½�����Сʱ������
	 * @param array
	 * @param target
	 * @return
	 */
	public boolean Find(int [][] array,int target) {
		boolean result = false;
		int dim1 = array.length-1;
		int dim2 = array[0].length-1;
		int i=dim1,j=0;
		while(i>=0&&j>=0&&i <= dim1 && j <= dim2){
			if(array[i][j] < target){
				j++;
			}else
			if(array[i][j] > target){
				i--;
			}else
			if(array[i][j] == target){
				result = true;
				break;
			}
		}
		
		return result;
    }
}
