package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex17_ClubBouncer { //Otherwise (If Statements with Else)

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		int age;
		boolean onGuestList;
		double allure;
		String gender;
		
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("Are you on the guest list? ");
		onGuestList = keyboard.nextBoolean();
		
		System.out.println("On a scale of 0 - 10, how hot are you? ");
		allure = keyboard.nextDouble();
		
		System.out.println("What gender do you identify as? ");
		gender = keyboard.next();

		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
			System.out.println("You are allowed to enter the club.");
		} 
		else {
			System.out.println("You are not allowed to enter the club.");
		}

	}

}
