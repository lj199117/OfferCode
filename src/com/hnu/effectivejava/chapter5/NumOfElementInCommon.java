package com.hnu.effectivejava.chapter5;

import java.util.HashSet;
import java.util.Set;

/**
 * 第23条 
 * List<?> list.add(o);错误 
 * List<?>一般只能用于读取，不能add，除非是null 实验 集合元素交集的个数
 * @author LJ
 *
 */
public class NumOfElementInCommon {
	public static void main(String[] args) {
		Set<Object> set1 = new HashSet<Object>();
		set1.add(new String("123"));
		set1.add(new String("234"));
		set1.add(new String("345"));
		set1.add(new String("123"));
		Set<Object> set2 = new HashSet<Object>();
		set2.add(new String("123"));
		set2.add(new String("234"));
		set2.add(new String("3345"));
		set2.add(new String("1233"));
		System.out.println(set1.size());
		System.out.println(numOfElementInCommon(set1,set2));
	}

	private static int numOfElementInCommon(Set<?> set1,Set<?> set2) {
		int result = 0;
		for(Object o : set1){//说明  <?>一般只能用于读取，不能add
			if(set2.contains(o))
				result++;
		}
		return result;
	}
}
