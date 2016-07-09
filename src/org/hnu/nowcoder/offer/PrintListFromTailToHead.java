package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Iterator;

import org.hnu.nowcoder.share.ListNode;


/**
 * ��Ŀ����
 * 
 * ����һ�����?��β��ͷ��ӡ����ÿ���ڵ��ֵ��
 * 
 * @author LJ
 * 
 */
public class PrintListFromTailToHead {
	public static void main(String[] args) {
		new PrintListFromTailToHead().run();

	}

	private void run() {
		// TODO Auto-generated method stub
		ListNode listNode = new ListNode(1);
		ListNode p = listNode;
		for (int i = 2; i < 10; i++) {
			ListNode newNode = new ListNode(i);
			p.next = newNode;
			p = newNode;
		}
		System.out.println(listNode);
		ArrayList<Integer> list = printListFromTailToHead(listNode);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode pNode = listNode;
		if (pNode != null) {
			list = printListFromTailToHead(pNode.next);
			list.add(pNode.val);
		}
		return list;
	}

}

