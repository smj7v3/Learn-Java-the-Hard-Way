package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex49_ArrayLinearSearch { //Finding Things in an Array

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		int[] orderNumbers = {12345, 54321, 101010, 8675309, 31415, 271828};
		int toFind;
		
		System.out.print("There are " + orderNumbers.length);
		System.out.println(" orders in the database.");
		
		System.out.print("Orders: ");
		for (int num : orderNumbers) {
			System.out.print(num + "  ");
		}
		System.out.println();
		
		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();
		
		for (int num : orderNumbers) {
			if (num == toFind) {
				System.out.println(num + " found.");
			}
			else {
				System.out.println(num + " not found.");
				;
			}
		}
	}

}
