package com.hnu.offer;

public class Title1 {
	public static void main(String[] args) {
		new Title1().run();
	}
	
	public void run(){
		String str = "my  name is  lj ";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(replaceSpace(sb));
	}
	
    public String replaceSpace(StringBuffer str) {
    	for(int i=0;i<str.length();i++){
    		char c = str.charAt(i);
    		if(c==' '){
    			str.replace(i, i+1, "%20");
    		}
    	}
    	return str.toString();
    }
	
}
