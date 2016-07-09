package com.hnu.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * �ַ���ͬ����˵���˾��ǿ��Ƿ�����ӳ��,������ӳ�������ӳ��
 * ����s��ÿһ����ĸ�����Ҽ�¼s[i]��t[i]��ӳ�䣬�����������е�ӳ�䲻ͬʱ��˵���޷�ͬ����ֱ��return false��
 * a->e  ��  e->a��������ͬӳ��
 * @author LJ
 *
 */
public class IsomorphicString {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("foo", "bar"));
		
		System.out.println(isIsomorphic("food", "appb"));
		
		System.out.println(isIsomorphic("egga", "appe"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
	    if(s==null || t==null)
	        return false;
	 
	    if(s.length() != t.length())
	        return false;
	 
	    if(s.length()==0 && t.length()==0)
	        return true;
	 
	    HashMap<Character, Character> map = new HashMap<Character,Character>();
	    for(int i=0; i<s.length(); i++){
	        char c1 = s.charAt(i);
	        char c2 = t.charAt(i);
	        
	        //��ȡc2�ַ�ӳ���Key,û�������
	        Character c = getMappingKey(map, c2);
	        if(c != null && c!=c1){
	            return false;
	        }else if(map.containsKey(c1)){
	            if(c2 != map.get(c1))
	                return false;
	        }else{
	            map.put(c1,c2);
	        }
	    }
	 
	    return true;
	}
	 
	// a method for getting mapping of a target value
	public static Character getMappingKey(HashMap<Character,Character> map, Character target){
		for(Entry<Character, Character> set : map.entrySet()){
			if(set.getValue().equals(target)){
				return set.getKey();
			}
			
		}
	   return null;
	}
}
