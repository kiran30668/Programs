package com.practice;

public class ReverseNumberDemo10 {

	public static void main(String[] args) {
		
		int num=2654;
		int revnum=0;
		System.out.println("Original Number: "+num);
		
		//While loop
		while(num!=0) {
			int reminder=num%10;
			revnum=revnum*10+reminder;
			num=num/10;
		}
		System.out.println("Reversed number is: "+revnum);
		
		//Using For Loop
		for(; num!=0; num=num/10) {
			int reminder=num%10;
			revnum=revnum*10+reminder;
		}
		
		System.out.println("Reversed number is: "+revnum);
	}

}
