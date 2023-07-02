package com.practice;

public class CompareTwoStrings25 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		
		boolean bothStringsAreEqual=compareStrings(s1, s2);
		System.out.println("Both the Strings are Equal? :"+bothStringsAreEqual);

	}

	public static boolean compareStrings(String s1, String s2) {
		/*
		 * 1.Check string is null or not?
		 * 2.compare both the string's length is same or not?
		 * 3.compare each character from both the strings
		 */
		
		if(s1==null || s2==null)
			return false;
		if(s1.length() != s2.length())
			return false;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}

}
