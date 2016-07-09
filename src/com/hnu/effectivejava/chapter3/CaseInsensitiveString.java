package com.hnu.effectivejava.chapter3;

//Broken - violates symmetry! - Pages 36-37

//破坏equals的对称性
public final class CaseInsensitiveString {
	private final String s;
	//不区分大小写
	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	// Broken - violates symmetry!
	@Override
	public boolean equals(Object o) {
		if (o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		if (o instanceof String) // One-way interoperability!(互操作)
			return s.equalsIgnoreCase((String) o);
		return false;
	}
	
	 //This version is correct.
	/*@Override 
	public boolean equals(Object o) {
	    return (o instanceof CaseInsensitiveString) &&
	        ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
	}*/
	
	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		CaseInsensitiveString cis2 = new CaseInsensitiveString("polish");
		String s = "polish";
		/**
		 * 因为String的equals方法实现和CaseInsensitiveString的方法实现不一样,所以导致不满足对称性
		 */
		System.out.println(cis.equals(s) + "  " + s.equals(cis)+ "  \n" + cis.equals(cis2));
	}
}
