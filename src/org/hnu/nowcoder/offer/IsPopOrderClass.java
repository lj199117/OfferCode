package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־���ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * 
 * ˼·����ѭ����pushA�е�Ԫ����ջ������Ĺ���м���popA����pop��Ԫ�� ���ѭ�������ջ�����գ���˵�������в���pop���С�
 * 
 * @author LJ
 * 
 */
public class IsPopOrderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new IsPopOrderClass().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 1, 4, 3, 2, 5 };
		System.out.println(IsPopOrder(pushA, popA));
	}

	/**
	 * ��Ϊ��Ŀ�����һ������ArrayList,������ArrayList��ģ��ջ
	 * 
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA == null || popA == null || pushA.length == 0
				|| popA.length == 0)
			return false;
		int i = 0,j = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i < pushA.length){
			list.add(pushA[i]);
			while((!list.isEmpty()) && list.get(list.size()-1) == popA[j]){
				list.remove(list.size()-1);
				j++;
			}
			i++;
		}
		if(list.isEmpty()) return true;
		return false;

/*		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < pushA.length; i++) {
			list.add(pushA[i]);
			while ((!list.isEmpty()) && (list.get(list.size() - 1) == popA[j])) {
				list.remove(list.size() - 1);
				j++;
			}
		}
		return list.isEmpty() == true;*/
	}

	/**
	 * ջ�ṹ��ʵ��
	 * 
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean IsPopOrder(ArrayList<Integer> pushA, ArrayList<Integer> popA) {
		Stack stack = new Stack();
		if (pushA.size() == 0 && popA.size() == 0)
			return true;
		for (int i = 0, j = 0; i < pushA.size(); i++) {
			stack.push(pushA.get(i));
			while ((!stack.empty()) && (stack.peek() == popA.get(j))) {
				stack.pop();
				j++;
			}
		}

		return stack.empty() == true;
	}

}
