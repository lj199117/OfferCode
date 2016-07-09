package org.hnu.nowcoder.offer;

import org.hnu.nowcoder.share.TreeNode;



/**
 * Ҫ������A���Ƿ���ں���B�ṹһ������������Էֳ�������
 * ��һ������A�в���������ֵһ��Ľ�㣬��ʵ���Ͼ������ı���ݹ����HasSubTree���������A�������ĳһ����ֵ����B��ͷ����ֵ��ͬ�������DoesTreeHavaTree2�����ڶ����жϡ�
 * 
 * �ڶ������ж���A����RΪ����������ǲ��Ǻ���B������ͬ�Ľṹ��
 * @author LJ
 *
 */
public class HasSubTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HasSubTree().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int[] pre = {1,8,2,6,5,3};
		int[] in = {2,6,8,5,1,3};
//		int[] pre = {1,2,3,4,5,6,7,8,9};
//		int[] in = {2,4,3,5,1,6,7,8,9};
		TreeNode root1 = this.reConstructBinaryTree(pre, in);
		int[] pre2 = {2,6};
		int[] in2 = {2,6};
		TreeNode root2 = this.reConstructBinaryTree(pre2, in2);
		System.out.println(HasSubtree(root1,root2));
	}
	
	/**
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1 == null || root2 == null) 
			return false;
		//����ͬ �ж��Ƿ�Ϊ����
		if(root1.val == root2.val) 
			result = DoesTree1HaveTree2(root1,root2);
		//��ͬ root1�����ƶ�
		if(!result) 
			result = HasSubtree(root1.left, root2);
		if(!result) 
			result = HasSubtree(root1.right, root2);
        return result;
    }

	private boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2) {
		if(root2 == null) return true;
		if(root1 == null) return false;
		if(root1.val == root2.val){
			return DoesTree1HaveTree2(root1.left, root2.left) && DoesTree1HaveTree2(root1.right, root2.right);
		}
		return false;
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
