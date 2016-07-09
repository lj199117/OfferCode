package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Iterator;

import org.hnu.nowcoder.share.TreeNode;


/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * 
 * ����һ�����Ĳ��������
 * 
 * ˼������õ�������Ϊ��ʱ�ռ�
 * @author LJ
 *
 */
public class PrintTreeFromTopToBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintTreeFromTopToBottom().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
//		int[] pre = {1,2,3,4,5,6,7,8,9};
//		int[] in = {2,4,3,5,1,6,7,8,9};
		TreeNode root = this.reConstructBinaryTree(pre, in);
		ArrayList<Integer> list = PrintFromTopToBottom(root);
		int i=0;
		while(!list.isEmpty() && i < list.size()){
			System.out.println(list.get(i++));
		}
	}

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		if(root == null)
			return list;
		if(root != null) queue.add(root);
		while(!queue.isEmpty()){
			TreeNode tNode = queue.remove(0);
			if(tNode.left != null)
				queue.add(tNode.left);
			if(tNode.right != null)
				queue.add(tNode.right);
			list.add(tNode.val);
		}
		return list;
		
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre == null || in == null || pre.length == 0 || in.length == 0)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		int rootPos = getPosition(in, pre[0]);
		root.left = reConstructBinaryTree(copy(pre, 1, rootPos), copy(in,0,rootPos-1));
		root.right = reConstructBinaryTree(copy(pre, rootPos + 1, pre.length-1), copy(in, rootPos + 1, pre.length-1));
		return root;
    }
	
	private int[] copy(int[] original, int from, int to){
		int[] array = new int[to - from + 1];
		try {
			System.arraycopy(original, from, array, 0, to-from+1);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return array;
	}
	private int getPosition(int[] array,int target){
		for(int i=0;i<array.length;i++){
			if(array[i] == target)
				return i;
		}
		return -1;
	}
}
