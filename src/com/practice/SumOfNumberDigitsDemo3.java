package com.practice;

public class SumOfNumberDigitsDemo3 {
	//2567  -> 2+5+6+7==>
	public static void main(String[] args) {
		int number=2567, reminder, sum=0;
		
		while(number>0) {
			reminder=number%10;
			sum=sum+reminder;
			number=number/10;
		}
		
		System.out.println("The sum of all digits in a given number is: "+sum);
	}

}
