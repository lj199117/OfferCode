package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Iterator;

import org.hnu.nowcoder.share.TreeNode;

/**
 * ����һ�Ŷ�������һ�������ӡ���������н��ֵ�ĺ�Ϊ�������������·����
 * ·������Ϊ�����ĸ��㿪ʼ����һֱ��Ҷ������Ľ���γ�һ��·����
 * 
 * ˼�룺�������
 * @author LJ
 *
 */
public class FindPathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FindPathClass().run();
	}
	private void run() {
		 //TODO Auto-generated method stub
//		int[] pre = {1,2,4,7,3,5,6,8};
//		int[] in = {4,7,2,1,5,3,8,6};
		int[] pre = {1,2,3,4,5,6,7,8,9};
		int[] in = {2,4,3,5,1,6,7,8,9};
		TreeNode root = this.reConstructBinaryTree(pre, in);
		ArrayList<ArrayList<Integer>> path = FindPath(root,10);
		for(int i=0;i<path.size();i++){
			 ArrayList<Integer> re = path.get(i);
			 for(int j=0;j<re.size();j++)
				 System.out.print(re.get(j)+" ");
		}
	}
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> re = new ArrayList<ArrayList<Integer>>();
        if(root==null){
            return re;
        }
        dfs(root, target, re, new ArrayList<Integer>(), 0);
        return re;
    }
	//��ΪJava��ֵ���� ������void Ҳ��ͬһ������ֵ �ı�Ķ���һ��
    void dfs(TreeNode root, int target,
            ArrayList<ArrayList<Integer>> re, 
            ArrayList<Integer> item, int sum) {
        if (root == null) {
            return;
        }
        item.add(root.val);
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == target) {
                re.add((ArrayList<Integer>) item.clone());
            }
        } else {
            if (sum >= target) {// ��֦
            	
            } else {
                dfs(root.left, target, re, item, sum);
                dfs(root.right, target, re, item, sum);
            }
        }
        item.remove(item.size() - 1);
        sum -= root.val;
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
