package com.practice;

public class SwapTwoNumbersUsingTempVariable7 {

	public static void main(String[] args) {
		
		int first= 20;
		int second=30;
		
		System.out.println("First value before swapping: "+first);
		System.out.println("Second value before swapping: "+second);
		
		int temp=first;
		first=second;
		second=temp;
		
		System.out.println("--------------------------------------");
		System.out.println("First value after swapping: "+first);
		System.out.println("Second value after swapping: "+second);
	}

}
