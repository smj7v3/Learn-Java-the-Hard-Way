package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex26_HighLow { //A Number-Guessing Game

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(100 * Math.random());
		
		System.out.println("I'm thinking of a number between 1-100.");
		System.out.println("Try to guess it!");
		System.out.print("> ");
		guess = keyboard.nextInt();
		
		while (secret != guess) {
			if (guess < secret) {
				System.out.print("Sorry, your guess is too low. ");	
			}
			if (guess > secret) {
				System.out.print("Sorry, your guess is too high. ");
			}
			System.out.print("Try again.\n> ");
			guess = keyboard.nextInt();
		}
		
		System.out.println("You guessed it! What are the odds?!?");

	}

}
