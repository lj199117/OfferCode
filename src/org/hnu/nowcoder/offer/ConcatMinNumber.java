package org.hnu.nowcoder.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * ����֪�ַ���ƴ����С��ֵ
 * @author LJ
 *
 */
public class ConcatMinNumber {
	public static void main(String[] args) {
		System.out.println("313".compareTo("3a2"));
		new ConcatMinNumber().run();
		System.out.println("a".compareTo("b"));
	}

	private void run() {
		int[] numbers = { 3, 32, 321 };
		System.out.println(PrintMinNumber(numbers));
	}

	public String PrintMinNumber(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++)
			list.add(numbers[i]);
		Collections.sort(list, new ComparatorClass());
		String str = "";
		for(int i : list)
			str += i;
		return str;
	}
}

class ComparatorClass implements Comparator<Integer> {
	// String��compareTo��ʵ�������αȽ������ַ�ASC�롣
	//"abc".compareTo("abcdef") == -3
	//"abcdef".compareTo("abc") == 3
	public int compare(Integer num1, Integer num2) {
		String s1 = num1 + "" + num2;
		String s2 = num2 + "" + num1;
		return s1.compareTo(s2);
	}
}