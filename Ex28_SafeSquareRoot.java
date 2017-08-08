package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex28_SafeSquareRoot { //Using Loops for Error-Checking
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		double x, y;
		String yes;
		
		System.out.print("Are you ready? ");
		yes = keyboard.nextLine().toLowerCase();
		
		while (!yes.equals("yes")) {
			System.out.print("No? How about now? ");
			yes = keyboard.nextLine();
		}
		
		System.out.print("Give me a number, and I'll find its square root. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();
		
		while (x < 0) {
			System.out.println("I won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of " + x + " is " + y);

	}

}
