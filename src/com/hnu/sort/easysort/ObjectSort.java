package com.hnu.sort.easysort;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSort {
	
	public static void objectSort(List list,Comparator c){
		if(c != null)
			Collections.sort(list,c);
		else Collections.sort(list);
		displayObject(list);
	}
	
	private static void displayObject(List list){
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
		System.out.println();
	}
}
