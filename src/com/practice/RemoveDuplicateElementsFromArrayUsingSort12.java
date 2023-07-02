package com.practice;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArrayUsingSort12 {

	//Array is an object which contains elements of similar data type
	
	//Input Array ->{1,2,2,2,3,4,4,5,6,6,7}
	//Output Array ->{1,2,3,4,5,6,7}
	
	//Input Array ->{"krishna","krishna","kumar","kumar","sakinala"}
	//Output Array ->{"krishna","kumar","sakinala"}
	
	//4.Ways:
	//1.Using ArraySort
	//2.Using HashMap
	//3.Using Set
	//4.Using Streams
	
	public static void main(String[] args) {
		int[] arr= {7, 1, 2, 2, 6, 2, 3, 4, 5, 4, 6};
		Arrays.sort(arr); // This will sort the array in ascending order
		
		int[] temp= new int[arr.length];
		int j=0;
		
		//int[] arr={1,2,2,2,3,4,4,5,6,6,7}
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) { //checking or comparing elements with its next element.
				temp[j++]=arr[i];
			}
		}
		
		//Storing the last element directly in the last index of temp array
		temp[j++]=arr[arr.length-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(temp[i]+" ");
		}
		
		
		
		System.out.println("\n----------------------------------------");
		
		Integer[] arr1= {7,1,2,2,6,2,3,4,5,4,6};
		removeDuplicateElementsFromSortedArray(arr1);
		
		System.out.println("\n----------------------------------------------");
		
		String[] str1= {"krishna","krishna","kumar","kumar","sakinala"};
		removeDuplicateElementsFromSortedArray(str1);
	}
	
	
	private static void removeDuplicateElementsFromSortedArray(Object[] object) {
		Arrays.sort(object);
		
		int length=object.length;
		
		Object temp[]=new Object[length];
		int j=0;
		
		for (int i = 0; i < object.length-1; i++) {
			if(object[i]!=object[i+1]) {   //Checking or comparing elements with its next element
				temp[j++]=object[i];
			}
		}
		
		//storing the last element directly in the last index of temp array
		temp[j++]=object[length-1];
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
