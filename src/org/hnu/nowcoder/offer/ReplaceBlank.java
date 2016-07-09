package org.hnu.nowcoder.offer;

public class ReplaceBlank {
	public static void main(String[] args) {
		new ReplaceBlank().run();
	}
	private void run() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("hello world");
		
		
		System.out.println(this.replaceSpace(str));
	}
	
	public String replaceSpace(StringBuffer str) {
    	return str.toString().replaceAll("\\s", "%20");
    }
}
