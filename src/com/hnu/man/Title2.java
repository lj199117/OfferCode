package com.hnu.man;

public class Title2 {
	public static void main(String[] args) {
		new Title2().run();
	}
	
	public void run(){
		int sb = -9;
		System.out.println(NumberOf1(sb));
	}
	
	public int NumberOf1(int n) {
		int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
	
}
