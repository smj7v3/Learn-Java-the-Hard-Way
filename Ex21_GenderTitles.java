package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex21_GenderTitles { //Nested If Statements

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		String title;
		
		System.out.print("First Name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender = keyboard.next();
		System.out.print("Age: ");
		int age = keyboard.nextInt();
		
		if (age < 20) {
			title = first;
		}
		else {
			if (gender.equals("F")) {
				System.out.print("Are you married, " + first + "? (Y/N): ");
				String married = keyboard.next();
				if (married.equals("Y") || married.equals("y")) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}
			}
			if (gender.equals("M") || gender.equals("m")) {
				title = "Mr.";
			}
			else {
				title = "error";
				last = "";
			}
		}
		
		System.out.println("\n" + title + " " + last);
	}

}
