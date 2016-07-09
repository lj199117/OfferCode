package org.hnu.nowcoder.offer;

import java.util.ArrayList;

import org.hnu.nowcoder.share.ListNode;

/**
 * ���������������������?�����������ϳɺ�����?��Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * ����ʵ�ֵݹ���ǵݹ�汾(��Ӧ����ԭ���������޸�,Ӧ�����󿪳���������)
 * @author LJ
 *
 */
public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MergeList().run();
	}
	private ArrayList<ListNode> prepare(){
		ArrayList<ListNode> arrayList = new ArrayList<ListNode>();
		ListNode listNode1 = new ListNode(1);
		ListNode p = listNode1;
		for (int i = 3; i < 7; i++) {
			if(i % 2 == 0) continue;
			ListNode newNode = new ListNode(i);
			p.next = newNode;
			p = newNode;
		}
		ListNode listNode2 = new ListNode(2);
		ListNode p2 = listNode2;
		for (int i = 4; i < 7; i++) {
			if(i % 2 != 0) continue;
			ListNode newNode = new ListNode(i);
			p2.next = newNode;
			p2 = newNode;
		}
		arrayList.add(listNode1);
		arrayList.add(listNode2);
		return arrayList;
	}
	private void run() {
		// TODO Auto-generated method stub
		ListNode node = Merge(prepare().get(0),prepare().get(1));
		while(node != null){
			System.out.print(node.val+" ");
			node = node.next;
		}
		System.out.println();
		ListNode node_Recursive = Merge_Recursive(prepare().get(0),prepare().get(1));
		while(node_Recursive != null){
			System.out.print(node_Recursive.val+" ");
			node_Recursive = node_Recursive.next;
		}
	}
	
	/**
	 * �ǵݹ�汾
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		ListNode head = null,cur = null;
		while(list1 != null && list2 != null){
			if(list1.val <= list2.val){
				if(head == null){
					head = cur =  list1;
				}else{
					cur.next = list1;
					cur = cur.next;
				}
				list1 = list1.next;
			}else{
				if(head == null){
					head = cur =  list2;
				}else{
					cur.next = list2;
					cur = cur.next;
				}
				list2 = list2.next;
			}
		}
		
		if(list1 == null){
			cur.next = list2;
		}
		if(list2 == null){
			cur.next = list1;
		}
        return head;
    }
	/**
	 * �ݹ�汾
	 * @param list1
	 * @param list2
	 * @return
	 */
	public ListNode Merge_Recursive(ListNode list1,ListNode list2) {
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		ListNode head = null;
		
		if(list1.val <= list2.val){
			head = list1;
			head.next = Merge_Recursive(list1.next, list2);
		}else{
			head = list2;
			head.next = Merge_Recursive(list1, list2.next);
		}
		return head;
	}
	
	
}
