package com.hnu.ordinal;

import java.util.HashMap;
import java.util.Map;

public class King {
	public static void main(String[] args) {
		new King().pritfUnionCollection("Kingsofte", "Wiigos");
	}
	//求字符串交集
	void pritfUnionCollection(String A,String B){
		char[] achars = A.toCharArray();
		char[] bchars = B.toCharArray();
		if(achars.length == 0 || bchars.length ==0) return;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c:achars){
			map.put(c, 1);
		}
		for(char c:bchars){
			if(map.containsKey(c) && map.get(c)!=0){
				System.out.print(c);
				map.put(c, 0);
			}
		}
	}
}
