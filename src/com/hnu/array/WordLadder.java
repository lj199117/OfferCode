package com.hnu.array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Given two words (start and end), and a dictionary, 
 * find the length of shortest transformation sequence from start to end,
 * such that only one letter can be changed at a time 
 * and each intermediate word must exist in the dictionary.
 * 单步渐变 每次只能改变一个字符
 * @author LJ
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * "hit" -> "hot" -> "dot" -> "dog" -> "cog"
 */
public class WordLadder {
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		dict.add("lct");
		dict.add("cot");
		dict.add("coo");
		for(WordNode temp : ladderQueue(start, end, dict)){
			System.out.println(temp.numSteps+":"+temp.word+",pre"+temp.pre);
		}
		
	}
	
	/**
	 * 最后可以看作一个图  找最短路径
	 * @param beginWord
	 * @param endWord
	 * @param wordDict
	 * @return
	 */
	public static Queue<WordNode> ladderQueue(String beginWord, String endWord, Set<String> wordDict) {
		
		Queue<WordNode> wordQueue = new LinkedList<WordNode>();
		Queue<WordNode> processQueue = new LinkedList<WordNode>();
		wordQueue.add(new WordNode(beginWord, 1, null));
		wordDict.add(endWord);
		
		while(!wordQueue.isEmpty()){
			WordNode top = wordQueue.remove();

			processQueue.add(top);
			String word = top.word;
			
			if(word.equals(endWord)){
                return processQueue;
            }
			char[] arr = word.toCharArray();
			for(int i=0;i<arr.length;i++){
				for(char c = 'a';c < 'z';c++){
					char temp = arr[i];
					arr[i] = c;
					String newWord = new String(arr);
					if(wordDict.contains(newWord)){
						wordQueue.add(new WordNode(new String(arr), top.numSteps+1, top));
						wordDict.remove(newWord);
					}
					arr[i]=temp;
				}
			}
		}
		return processQueue;
	}
}

class WordNode{
    String word;
    int numSteps;
    WordNode pre;
    public WordNode(String word, int numSteps, WordNode pre){
        this.word = word;
        this.numSteps = numSteps;
        this.pre = pre;
    }
	@Override
	public String toString() {
		return "WordNode [word=" + word + "]";
	}
    
}