package com.practice;

import java.util.Arrays;

public class CompareArrays4 {

	public static void main(String[] args) {
		
		//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
		//Array is a collection of similar type of elements
		/*int[] a= {1,3,5};
		int[] b= {1,3,5,4};*/
		
		String[] a= {"apple","cat","bat"};
		String[] b= {"apple","cat","bat"};
		
		if(Arrays.equals(a, b)) {
			System.out.println("Both the Arrays are Equal");
		}else {
			System.out.println("Both the Arrays are not Equal");
		}

	}

}
