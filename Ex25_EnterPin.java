package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex25_EnterPin { // Repeating Yourself with the While Loop
	
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		String password, entry;
		int pin, entry2;
	
		String now = null;
		password = now;
		
		System.out.print("PLEASE ENTER YOUR PASSWORD: ");
		entry = keyboard.nextLine();
		
		while (!entry.equals("now")) {
			System.out.println("INCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("\nPLEASE ENTER YOUR PASSWORD: ");
			entry = keyboard.nextLine();
		}
		
		pin = 12345;

		System.out.println("\nWELCOME TO THE JAROMACK BANK.");
		System.out.print("\nENTER YOUR PIN: ");
		entry2 = keyboard.nextInt();

		while (entry2 != pin) {
			System.out.println("INCORRECT PIN. TRY AGAIN.");
			System.out.print("\nENTER YOUR PIN: ");
			entry2 = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}
