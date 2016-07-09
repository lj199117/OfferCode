package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Iterator;

import org.hnu.nowcoder.share.ListNode;

/**
 * ����һ�����?����������е����k����㡣
 * ˼�룺
 * pָ�����ܣ����Ҽ�¼�ڵ���pָ������k-1���ڵ��preָ�뿪ʼ�ܣ�
 * ��pָ���ܵ����ʱ��pre��ָָ����ǵ����k���ڵ�
 * @author LJ
 *
 */
public class FindKthToTailClass {
	public static void main(String[] args) {
		new FindKthToTailClass().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		ListNode p = listNode;
		for (int i = 2; i < 10; i++) {
			ListNode newNode = new ListNode(i);
			p.next = newNode;
			p = newNode;
			System.out.println(p.val);
		}
		ListNode node = FindKthToTail(listNode,9);
		System.out.println(node.val);
	}
	
	public ListNode FindKthToTail(ListNode head,int k) {
		ListNode resNode = head;
		ListNode pNode = head;
		if(head==null||k<=0) return null;
		while(--k > 0){
			pNode = pNode.next;
			if(pNode == null){
				return null;
			}
		}
		while(pNode.next != null){
			resNode = resNode.next;
			pNode = pNode.next;
		}
		return resNode;
    }
}

