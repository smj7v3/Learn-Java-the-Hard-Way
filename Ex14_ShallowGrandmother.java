package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex14_ShallowGrandmother { //Compound Boolean Expressions

	private static Scanner keyboard;

	public static void main(String[] args) {

		keyboard = new Scanner(System.in);
		int age, happy;
		double income, cute;
		boolean allowed, allowed2;

		System.out.print("Enter your age: ");
		age = keyboard.nextInt();

		System.out.print("Enter your yearly income: ");
		income = keyboard.nextDouble();

		System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
		cute = keyboard.nextDouble();
		
		System.out.print("On a scale 1 - 10, how happy do they make you? ");
		happy = keyboard.nextInt();

		allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));
		allowed2 = (happy > 7);
		
		System.out.println("Allowed to date my grandchild? " + allowed);
		System.out.println("Allowed to date my grandchild? " + allowed2);

	}

}
