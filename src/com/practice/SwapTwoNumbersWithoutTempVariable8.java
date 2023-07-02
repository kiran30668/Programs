package com.practice;

public class SwapTwoNumbersWithoutTempVariable8 {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		
		System.out.println("A value before swapping: "+a);
		System.out.println("B value before swapping: "+b);
		System.out.println("---------------------------");
		
		a=a+b; //20+30==50
		b=a-b; //50-30==20
		a=a-b; //50-20==30
		
		System.out.println("A value after swapping: "+a);
		System.out.println("B value after swapping: "+b);

	}

}
