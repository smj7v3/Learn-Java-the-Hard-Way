package com.smj7v3.exercises;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Ex45_CaesarCipher { //Looping Through a String
	
	private static Scanner keyboard;

	public static char shiftLetter(char c, int n) {
		int u = c;
		
		if (!Character.isLetter(c)) {
			return c;
		}
		
		u = u + n;
		if (Character.isUpperCase(c) && u > 'Z'
		 || Character.isLowerCase(c) && u > 'z') {
			u -= 26;
		}
		if (Character.isUpperCase(c) && u < 'A'
		 || Character.isLowerCase(c) && u < 'a') {
			u +=26;
		}
		return (char)u;
	}
	
	public static void main(String[] args) throws Exception {
		setKeyboard(new Scanner(System.in));
		String plaintext, cipher = "";
		int shift;
		
		Scanner fileIn = new Scanner(new File("cipher-in.txt"));
		plaintext = fileIn.nextLine();
		shift = fileIn.nextInt();
		fileIn.close();
		
		System.out.println("Encrypting message: " + plaintext);
		System.out.println("Using shift: " + shift);
		
		for (int i = 0; i < plaintext.length(); i++) {
			cipher += shiftLetter(plaintext.charAt(i), shift);
		}
		PrintWriter out = new PrintWriter("cipher-out.txt");
		out.println(cipher);
		out.close();
	}

	public static Scanner getKeyboard() {
		return keyboard;
	}

	public static void setKeyboard(Scanner keyboard) {
		Ex45_CaesarCipher.keyboard = keyboard;
	}

}
