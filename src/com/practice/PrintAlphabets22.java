package com.practice;

public class PrintAlphabets22 {

	public static void main(String[] args) {
		System.out.println("Small Alphabets: ");
		for(char c='a';c<='z';c++) {
			System.out.print(c+" ");
		}
		System.out.println("\n-------------------------------------");
		
		System.out.println("Capital Alphabets: ");
		for(char c='A';c<='Z';c++) {
			System.out.print(c+" ");
		}
		
		System.out.println("\nSmall Alphabets Using ASCII Values:");
		for(char c=97;c<=122;c++) {
			System.out.print(c+" ");
		}
		
		System.out.println("\nCapital Alphabets Using ASCII values:");
		for(char c=65;c<=90;c++) {
			System.out.print(c+" ");
		}
	}

}
