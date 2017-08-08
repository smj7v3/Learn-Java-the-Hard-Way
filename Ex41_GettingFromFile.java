package com.smj7v3.exercises;

import java.io.File;
import java.util.Scanner;

public class Ex41_GettingFromFile { //Getting Data from a File

	public static void main(String[] args) throws Exception{
		String name;
		int a, b, c, sum;
		
		System.out.println("Getting name and three numbers from file...");
		Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));
			name = fileIn.nextLine();
			a = fileIn.nextInt();
			b = fileIn.nextInt();
			c = fileIn.nextInt();
			fileIn.close();
			
		System.out.println("done.");
		System.out.println("Your name is " + name);
		sum = a + b + c;
		System.out.println(a + "+" + b + "+" + c + "=" + sum);
	}
}
