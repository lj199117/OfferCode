package com.hnu.tree;

public class Node {
	int id;
	double data;
	Node leftChild;
	Node rightChild;
	
	public Node(int id, double data) {
		super();
		this.id = id;
		this.data = data;
	}
	public Node(int id, double data, Node leftChild, Node rightChild) {
		this(id,data);
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	@Override
	public String toString() {
		return "Node [id=" + id + ", data=" + data + "]";
	}
	public int getId() {
		return id;
	}
	public double getData() {
		return data;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setData(double data) {
		this.data = data;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
}
