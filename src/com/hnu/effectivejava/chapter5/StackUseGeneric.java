// Generic stack using E[] - Pages 125-127
package com.hnu.effectivejava.chapter5;
import java.util.Arrays;

/**
 * 第26条  最原始的Stack实现   使用了Object[]   数组存储
 * @author LJ
 *
 */
public class StackUseGeneric<E> {
    private E[] elements;
    private int size = 0;
    private static final int DObjectFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
	public StackUseGeneric() {
    	//不可能直接new一个泛型的实例,解决方法有二
    	//elements = new E[DObjectFAULT_INITIAL_CAPACITY];
    	/**
    	 * 1. 声明private E[] elements; 
    	 * 	     创建elements = (E[]) new Object[DObjectFAULT_INITIAL_CAPACITY];  
    	 *    pop中无需再强制转为E类型
    	 *    
    	 * 2. 声明private Object[] elements; 
    	 *    创建elements = new Object[DEFAULT_INITIAL_CAPACITY];
    	 *    pop中必须强制转为E类型,因为elements是Object数组
    	 *     @SuppressWarnings("unchecked") 
    	 *     E result = (E) elements[--size];
    	 *     
    	 *     本代码使用方法1 实现
    	 */
       
    	elements = (E[]) new Object[DObjectFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // Appropriate suppression of unchecked warning
    public E pop() {
        if (size==0)
            throw new EmptyStackException();

        E result = elements[--size];

        elements[size] = null; // eliminate obsolete reference
        return result;
    }

    public boolean isObjectmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    // Little program to exercise our generic Stack
    public static void main(String[] args) {
    	StackUseGeneric<String> stack = new StackUseGeneric<String>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isObjectmpty())
            System.out.println((String)stack.pop());
    }
}
