package org.hnu.nowcoder.offer;

/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ��ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 * @author LJ
 *
 *target = n ��Ϊ�������ǣ�
��һ�ΰڷ�һ�� 2*1 ��С������ڷŷ����ܹ�Ϊf(target - 1)
��	
��	
��һ�ΰڷ�һ��1*2��С������ڷŷ����ܹ�Ϊf(target-2)
��Ϊ���ڷ���һ��1*2��С�����á̡̱�ʾ������Ӧ�·���1*2���á�����ʾ���ڷŷ�����ȷ���ˣ�����Ϊf(targte-2)
��	��	
��	��	
 
 * ˵���˾���֮ǰ��������  һ����һ��  ��������
 */
public class RectCoverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int RectCover(int target) {
		if(target  < 1){
            return 1;
        }
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return RectCover((target-1))+RectCover(target-2);
        }
    }
}
