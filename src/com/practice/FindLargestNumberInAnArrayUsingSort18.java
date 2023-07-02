package com.practice;

import java.util.Arrays;

public class FindLargestNumberInAnArrayUsingSort18 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 596, 354, 2, 9};

		for (int a : arr) {
			System.out.print(a + " ");
		}

		Arrays.sort(arr);// Ascending Order
		System.out.println("\n-----------------------------");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println("\n----------------------------------");
		
		int arrLength = arr.length;
		int maxNumber = arr[arrLength - 1];

		System.out.println("The Largest Number is: " + maxNumber);

	}

}
