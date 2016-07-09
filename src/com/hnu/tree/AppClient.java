package com.hnu.tree;

import java.util.Stack;

public class AppClient {
	public static void main(String[] args) {
		new AppClient();
	}
	public AppClient() {
		// TODO Auto-generated constructor stub
		Tree tree = new Tree(0, 12);
		tree.insert(new Node(1, 8));
		tree.insert(new Node(5, 13));
		tree.insert(new Node(6, 12.5));
		tree.insert(new Node(2, 23));
		tree.insert(new Node(3, 10));
		tree.insert(new Node(4, 14));
		tree.displayTree();
		
		System.out.println(tree.find(14).getId());
		System.out.println("-------------");
		
		tree.preOrder(tree.getRoot());
		System.out.println("-------------");
		tree.inOrder(tree.getRoot());
		System.out.println("-------------");
		tree.postOrder(tree.getRoot());
		System.out.println("-------------");
		
		tree.delete(13);
		tree.displayTree();
		System.out.println("-------------");
	}
}
