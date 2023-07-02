package com.practice;

import java.util.Scanner;

public class PrintMultiplicationTable24 {

	public static void main(String[] args) {

		System.out.print("Which Table you want to print? :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " X " + i + " = " + number * i);
		}
	}

}
