package com.hnu.array;

import java.io.IOException;
import java.util.Stack;

/**
 * 前缀表达式被称作波兰表达式，后缀表达式称为逆波兰表达式（Reverse Polish Notation）。
 * @author LJ
 *
 */
public class RPN_PN {
	
	public static void main(String[] args) throws IOException {
		//计算后缀表达式的值(2+1)*3
		String[] tokens = new String[] { "2", "1", "+", "12", "*" };
		System.out.println(evalRPN(tokens));
		
		
		//计算前缀表达式的值A - B * C + D -> + - A * B C D
		String[] tokens1 = new String[] { "+", "-", "5", "*", "13","6","2"};
		System.out.println(evalPN(tokens1));
	}
	
	public static int evalPN(String[] tokens) {
		// TODO Auto-generated method stub
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		boolean operationFlag = false;
		for(String t:tokens){
			//是运算字符
			if(operators.contains(t)){
				stack.push(t);
				operationFlag = false;
			}else{
				while(!stack.empty() && !operators.contains(stack.peek())){
					int a = Integer.valueOf(t);
					int b = Integer.valueOf(stack.pop());
					String opr = stack.pop();
					int key = operators.indexOf(opr);
					switch (key) {
					 case 0:
	                     t = String.valueOf(a+b);
	                     break;
	                 case 1:
	                	 t = String.valueOf(b-a);
	                     break;
	                 case 2:
	                	 t = String.valueOf(a*b);
	                     break;
	                 case 3:
	                	 t = String.valueOf(b/a);
	                     break;
					}
				}
				
				stack.push(t);
				operationFlag = true;
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		return returnValue;
	}

	public static int evalRPN(String[] tokens) {
		int returnValue = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		
		for(String t : tokens){
			//是数字字符
			if(!operators.contains(t)){
				stack.push(t);
			}else{
				int key = operators.indexOf(t);
				int a = Integer.valueOf(stack.pop());
	            int b = Integer.valueOf(stack.pop());
				switch (key) {
				 case 0:
                     stack.push(String.valueOf(a+b));
                     break;
                 case 1:
                     stack.push(String.valueOf(b-a));
                     break;
                 case 2:
                     stack.push(String.valueOf(a*b));
                     break;
                 case 3:
                     stack.push(String.valueOf(b/a));
                     break;
				}
			}
		}
		returnValue = Integer.valueOf(stack.pop());
		
		return returnValue;
	}
}
