package org.hnu.nowcoder.course3;

import org.hnu.nowcoder.share.TreeNode;

/**
 * ͳ����ȫ�������Ľڵ���
����Ŀ��
��һ����ȫ��������ͷ�ڵ�head������������Ľڵ����
 * @author LJ
 *
 */
public class CompleteTreeNodeNum {
	public int nodeNum(TreeNode head) {
		if (head == null) {
			return 0;
		}
		return bs(head, 1, mostLeftHigh(head, 1));
	}
	public int bs(TreeNode node, int l, int h) {
		if (l == h) {
			return 1;
		}
		if (mostLeftHigh(node.right, l + 1) == h) {
			return (1 << (h - l)) + bs(node.right, l + 1, h);
		} else {
			return (1 << (h - l - 1)) + bs(node.left, l + 1, h);
		}
	}
	//������nodeΪ��� �������ĸ߶�
	public int mostLeftHigh(TreeNode node, int High) {
		while (node != null) {
			High++;
			node = node.left;
		}
		return High - 1;
	}
}
