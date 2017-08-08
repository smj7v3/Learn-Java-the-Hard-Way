package com.smj7v3.exercises;

import java.util.Scanner;
import java.io.PrintWriter;

public class Ex40_ReceiptRevisited { //Programs that Write to Files

	private static PrintWriter fileout;
	private static double total;
	private static Scanner keyboard;

	public static void main(String[] args) throws Exception{
		fileout = new PrintWriter("receipt.txt");
		keyboard = new Scanner(System.in);
		
		double ppg = 1.959;
		System.out.print("How many gallons do you want? ");
		double amount = keyboard.nextDouble();
		total = ppg * amount;

		System.out.println("Writing customized receipt to 'receipt.txt'... done.");
		
		fileout.println("+------------------------+");
		fileout.println("|                        |");
		fileout.println("|      CORNER STORE      |");
		fileout.println("|                        |");
		fileout.println("| 2017-02-05 04:38PM     |");
		fileout.println("|                        |");
		fileout.println("| Gallons: " + amount + "          |");
		fileout.println("| Price/gallon: $ " + ppg + "  |");
		fileout.println("|                        |");
		fileout.println("| Fuel total: $ " + total + "   |");
		fileout.println("|                        |");
		fileout.println("+------------------------+");
		fileout.close();
	}
}
