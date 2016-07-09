package org.hnu.nowcoder.offer;

import java.util.Arrays;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ������Ľ������������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * BST�ĺ������еĺϷ������ǣ�����һ������S�����һ��Ԫ����x ��Ҳ���Ǹ�
 * ���ȥ�����һ��Ԫ�ص�����ΪT����ôT���㣺�����ҵ�һ��λ��ʹ��T���Էֳ����Σ�
 * ǰһ�Σ���������С��x����һ�Σ�������������x���������Σ����������ǺϷ��ĺ������С������ĵݹ鶨��  ��
 * @author LJ
 *
 */
public class VerifySquenceOfBSTClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VerifySquenceOfBSTClass().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int[] seq = {6,8,19,9,11,13,12,10};
		//System.out.println(getPosition(seq));
		System.out.println(VerifySquenceOfBST(seq));
	}
	
	/**
	 * ������
	 * @param sequence
	 * @return
	 */
	public boolean VerifySquenceOfBSTII(int [] sequence) {
		int n=sequence.length;
        int i=0;
        if (n==0) {
            return false;
        }
        while (--n > 0) {
            while(sequence[i]<sequence[n]) i++;
            while (sequence[i]>sequence[n]) i++;
            if (i<n) return false;
            i=0;
        }
        return true;
	}
	
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length == 0) return false;
		if(sequence.length == 1) return true;
		
		if(getPosition(sequence) == -1) return false;
		else{
			int pos = getPosition(sequence);
			int[] leftSeq = new int[pos];
			int[] rightSeq = new int[sequence.length-pos-1];
			if(pos >= 0)
				System.arraycopy(sequence, 0, leftSeq, 0, pos);
			if(sequence.length >= 1)
				System.arraycopy(sequence, pos, rightSeq, 0, sequence.length-pos-1);
			return VerifySquenceOfBST(leftSeq) ||
					VerifySquenceOfBST(rightSeq);
		}
    }
	private int getPosition(int [] sequence){
		int cur = sequence[sequence.length - 1];
		int minPos = 0,maxPos = sequence.length - 1;
		while(minPos < maxPos){
			while(minPos >= 0 && sequence[minPos] < cur) minPos++;
			while(maxPos >= 0 && sequence[maxPos] >= cur) maxPos--;
			if(minPos < maxPos) return -1;
		}
		return minPos;
	}
}
