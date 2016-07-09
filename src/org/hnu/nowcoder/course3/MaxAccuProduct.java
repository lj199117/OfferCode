package org.hnu.nowcoder.course3;

/**
 * ����۳˻�
 * ��һ��double���͵�����arr�����е�Ԫ�ؿ���ɸ���0�������������۳˵����˻�
����arr=[-2.5��4��0��3��0.5��8��-1]��������[3��0.5��8]�۳˿��Ի�����ĳ˻�12��
���Է���12��


˼�룺����һ��dp��̬�滮���⣬�����ò��Ϲ滮�?

���ɣ�����������
1.���������...(�����п����ǲ������,��1 2 5 ������Ϊ1 5):���?ʽΪ ǰ��һ��i��ô�� Ȼ����i+1֮���������ô��ô��
2.���������(���ַ�)...(����������������):���?ʽΪ ������i��β��ʱ����ô�� Ȼ�����i+1��ô��ô��


���⣺����ص�����������ҵõ�����i��β����µ����˻�max����С�˻�min,���Ҽ��㵽i+1,�Ҿ�ֻҪ�������������
1.max*arr[i+1]  2 3 5
2.min*arr[i+1]  -5 3 -5
3.arr[i+1]      0.1 0.1 100
�������������ѡ��max min
 * @author LJ
 *
 */
public class MaxAccuProduct {
	public double maxProduct(double[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		double max = arr[0];
		double min = arr[0];
		double res = arr[0];
		double maxEnd = 0;
		double minEnd = 0;
		for (int i = 1; i < arr.length; ++i) {
			maxEnd = max * arr[i];
			minEnd = min * arr[i];
			max = Math.max(Math.max(maxEnd, minEnd), arr[i]);
			min = Math.min(Math.min(maxEnd, minEnd), arr[i]);
			res = Math.max(res, max);
		}
		return res;
	}
}
