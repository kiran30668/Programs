package com.practice;

public class ReverseAString1 {

	public static void main(String[] args) {
		//Method-1
		//Convert String into Character Array and use For loop
		String inputString="Saikiran";
		char[] chars = inputString.toCharArray();
		int length=chars.length;
		System.out.println("String length is: "+length);
		
		for(int i=length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		
		//Method-2
		//For Loop with charAt() method
		System.out.println("\n-----------------------------------");
		String revWord="";
		for (int i=length-1; i>=0; i--) {
			revWord=revWord+inputString.charAt(i);
		}
		System.out.println(revWord);
		
		//Method-3
		//Using String Buffer Class
		System.out.println("-----------------------------------------");
		StringBuffer sb=new StringBuffer(inputString);
		System.out.println(sb.reverse());
		
		//Method-4
		//Using String Builder Class
		System.out.println("------------------------------------------");
		StringBuilder sb1=new StringBuilder(inputString);
		System.out.println(sb1.reverse());
	}

}
