package com.hnu.toutiao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		char[][] carray = new char[line][12];
		String str = "";
		while(line-- > 0){
			str = in.next();
			char[] cs = str.toCharArray();
			for(int i=cs.length-1;i>=0;i--){
				carray[line][i] = cs[i];
			}
		}
		
		System.out.println(carray);
	}
}
