package com.practice;

import java.util.Arrays;

public class FindLargestNumberInAnArrayUsingStreams17 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 596, 354, 2, 9 };
		
		int maxNumber=Arrays.stream(arr).max().getAsInt();
		System.out.println("The Largest Number is: "+maxNumber);
	}

}
