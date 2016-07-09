package org.hnu.nowcoder.offer;

import java.util.Stack;

/**
 * ����ջ����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min����
 * 
 * ˼·����һ��ջdata������ݣ�������һ��ջmin����������ջ��С����
���磬data��������ջ��5,  4,  3, 8, 10, 11, 12, 1
             ��min������ջ��5,  4,  3��no,no, no, no, 1
 * @author LJ
 *
 */
public class MinStack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MinStack().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		
	}
	
	Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        if(temp != null){
            if(node <= temp ){
                temp = node;
                min.push(node);
            }
            data.push(node);
        }else{
            temp = node;
            data.push(node);
            min.push(node);
        }
    }
     
    public void pop() {
        int num = data.pop();
        int num2 = min.pop();
        if(num != num2){
           min.push(num2);
        }
    }
     
    public int top() {
        int num = data.pop();
        data.push(num);
        return num;
    }
     
    public int min() {
        int num = min.pop();
        min.push(num);
        return num;
    }
}
