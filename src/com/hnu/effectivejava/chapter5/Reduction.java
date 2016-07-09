// List-based generic reduction - Page 123
package com.hnu.effectivejava.chapter5;
import java.util.*;

/**
 * 第25条  最后一个例子
 * @author LJ
 *
 */
public class Reduction {
    //1、不用泛型最先想到的方法
    /*static Object reduce(List list,Function f,Object initVal){
    	synchronized (list) {
    		Object result = initVal;
        	for(Object e:list){
        		result = f.apply(result, e);//不建议在同步块中调用"外来"方法
        	}
        	return result;
		}
    }*/
	
	//2、因为不建议在同步块中调用"外来"方法,我们用list.toArray();代替同步块,并使用了泛型；但是有遇到编译麻烦如下：
	/*static <E> E reduce(List<E> list, Function<E> f, E initVal) {
		E[] snapshot = list.toArray(); //其内部实现了锁定list
		E result = initVal;
    	for(E e:snapshot){
    		result = f.apply(result, e);//不建议在同步块中调用"外来"方法
    	}
    	return result;
    }*/
	
	//3、用列表代替了数组的最终实现方式
	static <E> E reduce(List<E> list, Function<E> f, E initVal) {
	    List<E> snapshot;
	    synchronized(list) {
	        snapshot = new ArrayList<E>(list);
	    }
	    E result = initVal;
	    for (E e : snapshot)
	        result = f.apply(result, e);
	    return result;
	}
	
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(
            2, 7, 1, 8, 2, 8, 1, 8, 2, 8);

        // Reduce intList using each of the above reducers
        System.out.println(reduce(intList, SUM, 0));
        System.out.println(reduce(intList, PRODUCT, 1));
        System.out.println(reduce(intList, MAX, Integer.MIN_VALUE));
        System.out.println(reduce(intList, MIN, Integer.MAX_VALUE));
    }

    private static final Function<Integer> SUM = new Function<Integer>(){
        public Integer apply(Integer i1, Integer i2) {
            return i1 + i2;
        }
    };

    private static final Function<Integer> PRODUCT = new Function<Integer>(){
        public Integer apply(Integer i1, Integer i2) {
            return i1 * i2;
        }
    };

    private static final Function<Integer> MAX = new Function<Integer>(){
        public Integer apply(Integer i1, Integer i2) {
            return Math.max(i1, i2);
        }
    };

    private static final Function<Integer> MIN = new Function<Integer>(){
        public Integer apply(Integer i1, Integer i2) {
            return Math.min(i1, i2);
        }
    };
}
