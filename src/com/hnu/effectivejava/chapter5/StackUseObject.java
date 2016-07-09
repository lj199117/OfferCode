//stack using Object[] - Pages 125-127
package com.hnu.effectivejava.chapter5;
import java.util.Arrays;

/**
 * 第26条  最原始的Stack实现   使用了Object[]   数组存储
 * @author LJ
 *
 */
public class StackUseObject {
    private Object[] elements;
    private int size = 0;
    private static final int DObjectFAULT_INITIAL_CAPACITY = 16;

    public StackUseObject() {
        elements = new Object[DObjectFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // Appropriate suppression of unchecked warning
    public Object pop() {
        if (size==0)
            throw new EmptyStackException();

        // push requires elements to be of type Object, so cast is correct
        Object result = 
            (Object) elements[--size];

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
    	StackUseObject stack = new StackUseObject();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isObjectmpty())
            System.out.println((String)stack.pop());
    }
}
