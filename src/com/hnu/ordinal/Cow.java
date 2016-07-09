package com.hnu.ordinal;

import java.util.Scanner;

public class Cow {
	public static void main(String[] args) {
		new Cow().run();
	}

	private void run() {
		int[] a = new int[50];
		int i=0;
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n!=0){
            a[i++]=n;
            n = scanner.nextInt();
        }
        
        procedure(a);
	}
	
	public void procedure(int[] years){
        for(int year:years){
        	if(year==0 || year>50) return;
        	System.out.println(func(year));
        }
    }

	/*第一代永远都是1个
	第二代从第4年开始，每年加一个
	第三代从第7年开始，由上一代个数决定 每个产一个
	第四代从第10年开始 由上一代个数决定  每个产一个
	问题的实质是：从新牛出生起就开始了同一个问题 原问题的第1年就是新牛出生的那一年
	A1=1，A2=2，A3=3，A4=4，A5=A4+A1等，则依此规律，An=An-1+An-4*/
	private int func(int year) {
		
    	if(year<4){
    		return 1;
    	}else{
    		return func(year-3)+func(year-1);
    	}
	}
	
	
}
