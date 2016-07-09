package com.hnu.sort.easysort;

import java.util.ArrayList;
import java.util.List;

import com.hnu.sort.pojo.PersonImpComparable;


public class AppClient {
	static long[] array = {6,5,4,3,2,1};
	
	public static void main(String[] args) {
		
		//BubbleSort.bubbleSort(array);
		
		
		//SelectSort.selectSort(array);
		
		
		//InsertSort.insertSort(array);
		
		/*List list = new ArrayList<>();
		list.add(new Person(1,"q",5));
		list.add(new Person(1,"q",2));
		list.add(new Person(1,"q",7));
		list.add(new Person(1,"q",3));
		ObjectSort.objectSort(list, new PersonImpComparator());*/
		
		
		List list1 = new ArrayList<PersonImpComparable>();
		list1.add(new PersonImpComparable(1,"q",5));
		list1.add(new PersonImpComparable(1,"q",2));
		list1.add(new PersonImpComparable(1,"q",7));
		list1.add(new PersonImpComparable(1,"q",3));
		ObjectSort.objectSort(list1,null);
	}
	
}

