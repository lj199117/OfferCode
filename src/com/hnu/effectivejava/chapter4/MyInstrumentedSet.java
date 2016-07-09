package com.hnu.effectivejava.chapter4;

import java.util.*;
/**
 * 我自己做的一个复合类：
 * 直接将Set<E> set 组合在该类中,不再通过转发类的转发方法，希望能更好地理解"第16条 复合优于继承"
 * @author LJ
 *
 * @param <E>
 */
public class MyInstrumentedSet<E>{
	private int addCount = 0;
	private final Set<E> set;
	public MyInstrumentedSet(Set<E> s) {
		this.set = s;
	}

	public boolean add(E e) {
		addCount++;
		return set.add(e);
	}

	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return set.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	public static void main(String[] args) {
		MyInstrumentedSet<String> s = new MyInstrumentedSet<String>(
				new HashSet<String>());
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}
