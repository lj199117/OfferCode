package com.hnu.tree;

import java.util.Stack;

public class Tree {
	private Node root = null;

	public Tree(int id, double data) {
		// TODO Auto-generated constructor stub
		root = new Node(id, data, null, null);
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	// according to node's data insert into tree
	public void insert(Node node) {
		Node current = root;
		while (current != null) {
			if (current.getData() >= node.getData()) {
				if (current.leftChild == null) {
					current.leftChild = node;
					return;
				}
				current = current.leftChild;
			}

			if (current.getData() < node.getData()) {
				if (current.rightChild == null) {
					current.rightChild = node;
					return;
				}
				current = current.rightChild;
			}
		}
	}
	// delete node with given value
	public boolean delete(double value) 
	{ // (assumes non-empty list)
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		// found node to delete
		while (current.data != value) // search for node
		{
			parent = current;
			if (value < current.data) // go left?
			{
				isLeftChild = true;
				current = current.leftChild;
			} else // or go right?
			{
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null) // end of the line,
				return false; // didn't find it
		} // end while

		// if no children, simply delete it
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) // if root,
				root = null; // tree is empty
			else if (isLeftChild)
				parent.leftChild = null; // disconnect
			else
				// from parent
				parent.rightChild = null;
		}

		// if no right child, replace with left subtree
		else if (current.rightChild == null)
			if (current == root)
				root = current.leftChild;
			else if (isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;

		// if no left child, replace with right subtree
		else if (current.leftChild == null)
			if (current == root)
				root = current.rightChild;
			else if (isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;

		else // two children, so replace with inorder successor
		{
			// get successor of node to delete (current)
			Node successor = getSuccessor(current);

			// connect successor to current's left child
			successor.leftChild = current.leftChild;
			// connect parent of current to successor instead
			if (current == root)
				root = successor;
			else if (isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			
			//不置为null 则successor还是连接其他节点的
			successor = null;
//System.out.println(successor.leftChild.data);
//System.out.println(successor.rightChild.data);
		} // end else two children
		// (successor cannot have a left child)
		
		return true; // success
	} // end delete()

	/**
	 * 找后继节点
	 * 
	 * @param delNode
	 *            必须满足delNode有左右子节点
	 * @return delNode 的后继
	 */
	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild; // go to right child
		while (current != null) // until no more
		{ // left children,
			successorParent = successor;
			successor = current;
			current = current.leftChild; // go to left child
		}
		// if successor not right child(考虑delNode的右节点无左子节点情况)
		if (successor != delNode.rightChild) { // make connections
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}

	public Node find(double data) {
		Node current = root;
		while (current != null && current.data != data) {
			if (current.data > data) {
				current = current.leftChild;
			}
			if (current.data < data) {
				current = current.rightChild;
			}
			if (current.data == data) {
				return current;
			}
		}
		return current;
	}

	public void preOrder(Node root) {
		Node current = root;
		if (current != null) {
			System.out.println(current.data);
			preOrder(current.leftChild);
			preOrder(current.rightChild);
		}
	}

	public void inOrder(Node root) {
		Node current = root;
		if (current != null) {
			inOrder(current.leftChild);
			System.out.println(current.data);
			inOrder(current.rightChild);
		}
	}

	public void postOrder(Node root) {
		Node current = root;
		if (current != null) {
			postOrder(current.leftChild);
			postOrder(current.rightChild);
			System.out.println(current.data);
		}
	}

	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out
				.println("......................................................");
		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++)
				System.out.print(' ');

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.data);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null)
						isRowEmpty = false;
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for (int j = 0; j < nBlanks * 2 - 2; j++)
					System.out.print(' ');
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		} // end while isRowEmpty is false
		System.out
				.println("......................................................");
	}
}