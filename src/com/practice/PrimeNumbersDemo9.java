package com.practice;

public class PrimeNumbersDemo9 {

	public static void main(String[] args) {
		/*
		   5 --> 1x5, 5x1 (2,3,4)
		   7 --> 1x7, 7x1 (2,3,4,5,6)
		 */
		
		for(int i=2; i<=100;i++) {
			boolean isPrimeNumber=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrimeNumber=false;
					break;
				}
			}
			
			if(isPrimeNumber) {
				System.out.print(i+ " - ");
			}
		}
		
	}

}
