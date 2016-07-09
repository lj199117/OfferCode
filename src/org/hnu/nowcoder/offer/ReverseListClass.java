package org.hnu.nowcoder.offer;

import org.hnu.nowcoder.share.ListNode;



/**
 * ����һ�����?��ת�����������������Ԫ�ء�
 * 
 * ����Ϊ��ͷ�巨����
 * @author LJ
 *
 */
public class ReverseListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReverseListClass().run();
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
		ListNode node = ReverseList(listNode);
		System.out.println(node.val);
	}
	public ListNode ReverseList(ListNode head) {
		if(head == null) return null;
		ListNode headNode = head;
		ListNode dealNode = headNode.next;
		
		while(dealNode != null){
			headNode.next = dealNode.next;
			dealNode.next = head;
			head = dealNode;
			dealNode = headNode.next;
		}
		
		return head;
    }
}
