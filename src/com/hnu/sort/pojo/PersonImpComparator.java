package com.hnu.sort.pojo;

import java.util.Comparator;

public class PersonImpComparator implements Comparator<Person>{
	/**
	 * 这个类是一个比较器,Collections.sort( personList , new PersonImpComparator()) 可以对其排序
	 * 对两个类,我定义一个什么样的规则进行排序
	 */
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() > o2.getAge()) return 1;
		else if(o1.getAge() < o2.getAge()) return -1;
		return 0;
	}
	
}
