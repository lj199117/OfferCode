package com.hnu.offer;

import java.util.Stack;

public class Title3 {
	public static void main(String[] args) {
		new Title3().run();
	}

	public void run() {
		String sb = " ";
		System.out.println(ReverseSentence(sb));
	}

	public String ReverseSentence(String str) {
		int len = str.length();
		Stack<String> stack = new Stack<String>();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<len;i++){
			char c= str.charAt(i);
			if(c==' '){
				stack.push(sb.toString());
				sb = new StringBuffer();
				continue;
			}else sb.append(c);
		}
		stack.push(sb.toString());
		System.out.println(stack);
		sb = new StringBuffer();
		while(!stack.isEmpty()){
			sb.append(stack.pop()).append(" ");
		}
		return sb.deleteCharAt(sb.length()-1).toString();
	}

}
