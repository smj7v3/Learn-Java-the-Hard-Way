package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex27_KeepGuessing { //Infinite Loops

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(10 * Math.random());
		
		System.out.println("I have chosen a number between 1 and 10");
		System.out.println("Try to guess it.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		
		while (secret != guess) {
				System.out.println("That is incorrect. Guess again.");
				System.out.print("Your guess: ");
				guess = keyboard.nextInt();
		}
		
		System.out.println("That's right! You're a good guesser.");
	}

}
