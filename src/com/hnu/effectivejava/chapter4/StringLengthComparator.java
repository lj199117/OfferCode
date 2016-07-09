package com.hnu.effectivejava.chapter4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 第21条： 用函数对象表示策略
 * 
 * @author LJ
 *
 */
public class StringLengthComparator {
	//创建一个策略函数对象,这个类是一个内部类(静态成员类)而不是匿名类,这样的话,我们使用它的时候无需再new了,可以通过类名直接导出
	private static class StrLenComp implements Comparator<String>,Serializable{
		private static final long serialVersionUID = 1L;
		public int compare(String s1, String s2) {
			return s1.length()-s2.length();
		}
	}
	//导出策略函数对象
	public static final Comparator<String> STR_LEN_COM = new StrLenComp();
	
	/**
	 * 一个按字符串长度的比较器
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strA={"asfadf","adfs","sdfsdfsdfsf","0"};
		Arrays.sort(strA, StringLengthComparator.STR_LEN_COM);//使用策略函数对象,通过类名导出即可
		System.out.println(Arrays.toString(strA));
		
		//举例说明为什么不用匿名类二用静态成员类,因为这样在每次调用的时候都需要new一下
		Arrays.sort(strA,new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		});
	}
	
	
}
