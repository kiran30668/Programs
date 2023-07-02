package com.practice;

public class CompareArraysWithoutInbuiltFunctions5 {

	public static void main(String[] args) {
		String[] a= {"apple","cat","bat"};
		String[] b= {"apple","cat","bat"};
		
		/*Integer[] a= {1,3,5};
		Integer[] b= {1,3,5};*/
		
		
		//1.Number of elements should be same in each array
		//2.Index should match for each element
		
		if(arrayEqualityCheck(a, b)) {
			System.out.println("Both the Arrays are EQUAL");
		}else {
			System.out.println("Both the Arrays are not EQUAL");
		}
		
	}
	
	public static boolean arrayEqualityCheck(Object[] a,Object[] b) {
		if(a.length!=b.length) {
			return false;
		}else {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
