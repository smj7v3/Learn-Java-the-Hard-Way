package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex10_Sequencing { //Variables Only Hold Values

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print("How much is the purchase price? ");
		price = keyboard.nextDouble();
		
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println("Item price:\t" + price);
		System.out.println("Sales tax:\t" + salesTax);
		System.out.println("Total cost:\t" + total);
	}

}
