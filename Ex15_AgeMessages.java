package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex15_AgeMessages { //Making Decisions with If Statements

	private static Scanner keyboard;

	public static void main(String[] args) {

		keyboard = new Scanner(System.in);
		int age;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\ttoo young to create a Facebook account");
		}
		if (age < 16) {
			System.out.println("\ttoo you to get a driver's license");
		}
		if (age < 18) {
			System.out.println("\ttoo young to get a tattoo");
		}
		if (age < 21) {
			System.out.println("\ttoo young to purchase alcohol");
		}
		if (age < 35) {
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)");
		}
		if (age >= 65) {
			System.out.println("\told enough to retire!");
		}
		
	}

}
