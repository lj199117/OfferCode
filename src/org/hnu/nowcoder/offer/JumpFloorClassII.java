package org.hnu.nowcoder.offer;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�������
 * @author LJ
 *
 */
public class JumpFloorClassII {
	public static void main(String[] args) {
		//new JumpFloorClassII().run();
		System.out.println(12&(11));
	}
	private void run(){
		System.out.println(this.JumpFloorII(4));
		System.out.println(this.orJumpFloorII(4));
		
	}
	public int JumpFloorII(int target) {
		int sum = 0;
		if(target == 0) return 1;
		for(int i=1;i<=target;i++){
			sum += JumpFloorII(target-i);
		}
		return sum;
    }
	/**
	 * 6) �������Ѿ���һ�ֽ��ۣ�����Ϊ�˼򵥣����ǿ��Լ���򻯣�
    f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)
    f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)
    ���Եó���
    f(n) = 2*f(n-1)
	 * @param target
	 * @return
	 */
	 public int orJumpFloorII(int target) {
        if (target <= 0) {
            return -1;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * orJumpFloorII(target - 1);
        }
    }
}
