package com.practice;

import java.util.HashMap;

public class RemoveDuplicateElementsFromArrayUsingHashMap13 {

	//2.Using HashMap
	public static void main(String[] args) {
		
		int[] arr= {7,1,2,2,6,2,3,4,5,4,6};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length-1;i++) {
			if(map.containsKey(arr[i])) {
				map.remove(arr[i]);
			}
			map.put(arr[i], i); //(7,0),(1,1),(2,2),(6,3)
		}
		
		map.forEach((k,v)-> System.out.print(k+" "));
		
		System.out.println("\n----------------------------------------");
		
		Integer[] arr1= {7,1,2,2,6,2,3,4,5,4,6};
		removeDuplicateElementsFromArray(arr1);
		
		System.out.println("\n----------------------------------------------");
		
		String[] str1= {"krishna","krishna","kumar","kumar","sakinala"};
		removeDuplicateElementsFromArray(str1);
	}
	
	private static void removeDuplicateElementsFromArray(Object[] object) {
		HashMap<Object,Integer> map=new HashMap<>();
		for(int i=0;i<object.length-1;i++) {
			if(map.containsKey(object[i])) {
				map.remove(object[i]);
			}
			map.put(object[i], i);
		}
		
		map.forEach((k,v)-> System.out.print(k+" "));
	}

}
