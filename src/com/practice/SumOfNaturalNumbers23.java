package com.practice;

import java.util.Scanner;

public class SumOfNaturalNumbers23 {

	public static void main(String[] args) {
		System.out.print("Enter any Natural Number: ");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		
		int sumOfNaturalNumber=0;
		
		for(int i=1;i<=number;i++) {
			sumOfNaturalNumber=sumOfNaturalNumber+i;
		}
		
		System.out.println("Sum of "+number+" Natural Numbers is: "+sumOfNaturalNumber);
	}

}
