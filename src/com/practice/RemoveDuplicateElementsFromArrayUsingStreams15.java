package com.practice;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArrayUsingStreams15 {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 2, 6, 2, 3, 4, 5, 4, 6 };
		
		Arrays.stream(arr).distinct().forEach(e->System.out.print(e+" "));
		
		System.out.println("\n---------------------");
		String[] str1= {"krishna","krishna","kumar","kumar","sakinala"};
		Arrays.stream(str1).distinct().forEach(e->System.out.print(e+" "));
		
		System.out.println("\n--------------------------------");
		
		Integer[] arr1= {7,1,2,2,6,2,3,4,5,4,6};
		removeDuplicateElementsFromArrayUsingStreams(arr1);
		System.out.println("\n--------------------------------------------");
		String[] str2= {"krishna","krishna","kumar","kumar","sakinala"};
		removeDuplicateElementsFromArrayUsingStreams(str2);
	}
	
	private static void removeDuplicateElementsFromArrayUsingStreams(Object[] object) {

		Arrays.stream(object).distinct().forEach(e -> System.out.print(e+" "));
	}

}
