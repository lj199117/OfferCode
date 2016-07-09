package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author LJ
 *
 */
public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintMatrix().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[][] matrix= {{1}};
		ArrayList<Integer> list = printMatrix(matrix);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		int left = 0,up = 0;
		int right = matrix.length-1,down = matrix[0].length-1;
		System.out.println(right);
		ArrayList<Integer> list = new ArrayList<Integer>();		
		while(left <= right && up <= down){
			
			ArrayList<Integer> _list = printOuter(matrix,left,up,right,down);
			for(int i=0;i<_list.size();i++)
				list.add(_list.get(i));
			left ++;
			up ++;
			right --;
			down --;
		}
		return list;
	}
	
	private ArrayList<Integer> printOuter(int[][] matrix,int lrow,int lcol,int rrow,int rcol){
		ArrayList<Integer> list = new ArrayList<Integer>();
		//���Ӿ���ֻ��һ��
		if(lrow == rrow) 
			for(int i=lcol;i<=rcol;i++) 
				list.add(matrix[lrow][i]);
		else
		//���Ӿ���ֻ��һ��
		if(lcol == rcol)
			for(int i=lrow;i<=rrow;i++)
				list.add(matrix[i][lcol]);
		//һ�����,����α����,��Ҫ�����ĸ�����
		else{
			int curRow = lrow;
			int curCol = lcol;
			while(curCol != rcol){
				list.add(matrix[lrow][curCol]);
				curCol ++;
			}
			while(curRow != rrow){
				list.add(matrix[curRow][rcol]);
				curRow ++;
			}
			while(curCol != lcol){
				list.add(matrix[rrow][curCol]);
				curCol --;
			}
			while(curRow != lrow){
				list.add(matrix[curRow][lcol]);
				curRow --;
			}
		}
		
		return list;
	}
}
