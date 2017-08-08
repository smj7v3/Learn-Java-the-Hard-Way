package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex19_BMICategories { //Mutual Exclusion with Chains of If and Else

	private static Scanner keyboard;

	public static void main(String[] args) {

		keyboard = new Scanner(System.in);
		double bmi;
		
		System.out.print("Enter your BMI: ");
		bmi = keyboard.nextDouble();
		
		System.out.print("BMI category: ");
		if (bmi < 15.0) {
			System.out.println("very severly underweight");
		}
		else if (bmi <= 16.0) {
			System.out.println("severly underweight");
		}
		else if (bmi < 18.5) {
			System.out.println("underweight");
		}
		else if (bmi < 25.0) {
			System.out.println("normal weight");
		}
		else if (bmi < 30.0) {
			System.out.println("overweight");
		}
		else if (bmi < 35.0) {
			System.out.println("moderately obese");
		}
		else if (bmi < 40.0) {
			System.out.println("severyly obese");
		}
		else {
			System.out.println("very severly/\"morbidly\" obese");
		}

	}

}
