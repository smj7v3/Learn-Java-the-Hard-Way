package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex18_SecretWord { //If Statements with Strings

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		String secret = "please", guess;
		
		System.out.print("What's the secret word? ");
		guess = keyboard.next();
		
		if (guess.equals(secret) || guess.equals("now") || guess.equals("fuck you")) {
			System.out.println("That's correct!");
		}
		else {
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		}
		if (guess == secret) {
			System.out.println("This will enver ever show, no matter what.");
		}

	}

}
