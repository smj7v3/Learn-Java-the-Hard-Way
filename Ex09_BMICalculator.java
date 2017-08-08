package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex09_BMICalculator { //Calculations with User Input

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		double m, kg, bmi;
		
		System.out.print("Your height in m: ");
		m = keyboard.nextDouble();
		
		System.out.print("Your weight in kg: ");
		kg = keyboard.nextDouble();
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi);

	}

}
