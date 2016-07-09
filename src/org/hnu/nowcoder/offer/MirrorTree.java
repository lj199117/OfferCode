package org.hnu.nowcoder.offer;

import org.hnu.nowcoder.share.TreeNode;

/**
 * ������Ķ�����������任ΪԴ�������ľ��� 
 * �������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7  9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9  7  5
 * @author LJ
 *
 */
public class MirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MirrorTree().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
//		int[] pre = {1,2,3,4,5,6,7,8,9};
//		int[] in = {2,4,3,5,1,6,7,8,9};
		TreeNode root = this.reConstructBinaryTree(pre, in);
		postVisitTree(root);
	}
	public void Mirror(TreeNode root) {
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
        
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
	
	private void postVisitTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root != null){
			postVisitTree(root.left);
			postVisitTree(root.right);
			System.out.print(root.val+" ");
		}
	}
}
