package org.hnu.nowcoder.offer;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�������
 * @author LJ
 *
 */
public class JumpFloorClass {
	public static void main(String[] args) {
		new JumpFloorClass().run();
	}
	private void run(){
		System.out.println(this.JumpFloor(5));
	}
	public int JumpFloor(int target) {
		if(target < 0) return -1;
		if(target == 1) return 1;
		if(target == 2) return 2;
		return JumpFloor(target-1) + JumpFloor(target-2);
			
    }
}
