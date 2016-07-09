package org.hnu.nowcoder.offer;

import java.util.Arrays;

import org.hnu.nowcoder.share.TreeNode;


public class ReConstructBinaryTree {
	public static void main(String[] args) {
		new ReConstructBinaryTree().run();
//		int[] a = {1,2,3,4,5};
//		int[] b = new int[a.length];
//		System.arraycopy(a, a.length-1, b, 0, 1);
//		System.out.println(Arrays.toString(b));
	}
	
	private void run() {
		 //TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
//		int[] pre = {1,2,3,4,5,6,7,8,9};
//		int[] in = {2,4,3,5,1,6,7,8,9};
		TreeNode root = this.reConstructBinaryTree1(pre, in);
		postVisitTree(root);
	}
	private void postVisitTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root != null){
			postVisitTree(root.left);
			postVisitTree(root.right);
			System.out.print(root.val+" ");
		}
	}

	/**
	 * �ݹ�ⷨ�� 
	 * ��1�����ǰ�����Ϊ�ջ��������Ϊ�ջ�ڵ����С�ڵ���0������NULL�� 
	 * ��2��������ڵ㡣ǰ�����ĵ�һ����ݾ��Ǹ�ڵ����ݣ�
	 * ������������ҵ���ڵ��λ�ã��ɷֱ��֪����������������ǰ�������� �����У��ؽ�����������
	 * @param pre
	 * @param in
	 * @return
	 */
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
	
	public TreeNode reConstructBinaryTree1(int [] pre,int [] in) {
		if(pre == null || in == null || pre.length == 0 || in.length == 0)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		int rootPos = -1;
		for(int i=0;i<in.length;i++){
			if(in[i] == pre[0])
				rootPos = i;
		}
		int[] lpre = new int[rootPos];
		System.arraycopy(pre, 1, lpre, 0, rootPos);
		int[] lin = new int[rootPos];
		System.arraycopy(in, 0, lin, 0, rootPos);
		root.left = reConstructBinaryTree(lpre, lin);
		int[] rpre = new int[pre.length-1-rootPos];
		System.arraycopy(pre,  rootPos + 1, rpre, 0, pre.length-1-rootPos);
		int[] rin = new int[pre.length-1-rootPos];
		System.arraycopy(in,  rootPos + 1, rin, 0, pre.length-1-rootPos);
		root.right = reConstructBinaryTree(rpre, rin);
		return root;
    }
	
	
}

