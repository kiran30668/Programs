package com.practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayUsingSet14 {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 2, 6, 2, 3, 4, 5, 4, 6 };
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("\n----------------------");
		
		Set<Integer> set=new HashSet<>();
		
		for(int a:arr) {
			set.add(a);
		}
		
		set.forEach(e->System.out.print(e+" "));
		
		System.out.println("\n-------------------------------------");
		Integer[] arr1= {7,1,2,2,6,2,3,4,5,4,6};
		removeDuplicateElementFromArrayUsingSet(arr1);
		
		System.out.println("\n-------------------------------------");
		
		String[] str1= {"krishna","krishna","kumar","kumar","sakinala"};
		removeDuplicateElementFromArrayUsingSet(str1);
	}
	
	private static void removeDuplicateElementFromArrayUsingSet(Object[] object) {
		
		Set<Object> set=new HashSet<>();
		
		for(Object a:object) {
			set.add(a);
		}
		
		set.forEach(e->System.out.print(e+" "));
	}
}
