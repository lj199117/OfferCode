package org.hnu.nowcoder.offer;

import org.hnu.nowcoder.share.ListNode;


/**
 * 
�ҳ�2������ĳ��ȣ�Ȼ���ó���������������ĳ��ȲȻ����һ����
����Ϊ2�������ù�����β����
 * @author LJ
 *
 */
public class FindFirstCommonNodeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindFirstCommonNodeClass().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		ListNode listNode1 = new ListNode(1);
		ListNode p = listNode1;
		ListNode listNode2 = new ListNode(2);
		ListNode p2 = listNode2;
		for (int i = 3; i < 7; i++) {
//			if(i % 2 == 0) continue;
			ListNode newNode = new ListNode(i);
			p.next = newNode;
			p = newNode;
			p2.next = newNode;
			p2 = newNode;
		}
		
	
		System.out.println(FindFirstCommonNode(listNode1, listNode2).val);
	}
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1 == null || pHead2 == null) return null;
		int length1 = 0;
		int length2 = 0;
		ListNode cursor = pHead1;
		while(cursor != null){
			length1++;
			cursor = cursor.next;
		}
		cursor = pHead2;
		while(cursor != null){
			length2++;
			cursor = cursor.next;
		}
		int sub = 0;
		if(length1 > length2){
			sub = length1 - length2;
			while(sub-- > 0){
				pHead1 = pHead1.next;
			}
		}else{
			sub = length2 - length1;
			while(sub-- > 0){
				pHead2 = pHead2.next;
			}
		}
		
		while(pHead1!=null && pHead2!=null){
			if(pHead1.val == pHead2.val) return pHead1;
			pHead1 = pHead1.next;
			pHead2 = pHead2.next;
		}
		return null;
    }
}
