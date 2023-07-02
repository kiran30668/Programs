package com.practice;

public class RemoveStringWhiteSpace2 {

	public static void main(String[] args) {
		String str="Java is a programming language";
		//Method-1
		char[] chars = str.toCharArray();
		String str1="";
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]!=' ') {
				str1=str1+chars[i];
			}
		}
		System.out.println(str1);
		
		//Method-2
		System.out.println("\n--------------------------------");
		String str2="";
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]!=' ') {
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
		
		//Method-3
		System.out.println("-----------------------------------------");
		String str3 = str.replaceAll(" ", "");
		System.out.println(str3);
		
	}

}
