package com.cg.String;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str = "study ";
		String s1 =str.concat("hard");
		
		System.out.println(str);
		
		System.out.println(s1);
		
		StringBuffer str1 = new StringBuffer("study ");
		// for stringBuffer class uses append for concatenating 2 strings
		// for string variable it is concat
		str1.append("hard");
		System.out.println(str1);
		
	}

}
/*
	various methods using built in functions
	append(s)
	insert(int offset, String s)
	replace(int startindex, int endindex,String str)
	delete(int startindex, int endindex)
	reverse()
	capacity()
	ensureCapacity(int minimumCapcity)
	charAt(int index)
	length()
	substring(int beginIndex)
	substring(int beginIndex, int endIndex)
*/