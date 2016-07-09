package com.hnu.effectivejava.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * 第23条  List  List<String> List<?>参数匹配实验
 * @author LJ
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		// 方法add1和add2显示了List和List<Object>的区别
		// 方法add1,由于参数是List，当把List<String>作为参数传进来时，list添加了一个Integer类型，
		// string列表中添加了Integer类型的元素，破坏了安全性
		add1(strings, new Integer(1));
		String s = strings.get(0); // 出错，因为是Integer类型
		// 方法add2无法通过编译，因为无法接受List<String>作为参数
		//add2(strings, new Integer(1));

		// 方法add1和add3显示了List和List<?>的区别
		// 方法add3无法通过编译，List<?>一般只能用于读取，不能add，除非是null
		add3(strings, new Integer(1));

		//List<?>一般只能用于读取
		add1(strings,new String("12"));
		System.out.println(get(strings));
	}

	private static void add1(List list, Object o) {
		list.add(o);
	}

	private static void add2(List<Object> list, Object o) {
		list.add(o);
	}

	private static void add3(List<?> list, Object o) {
		//list.add(o);// 错误,List<?>一般只能用于读取，不能add，除非是null 见NumOfElement
		list.add(null);// 正确，可以添加null
	}
	
	private static String get(List<?> list){
		return (String) list.get(0);
	}
}
