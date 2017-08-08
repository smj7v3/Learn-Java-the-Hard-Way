package com.smj7v3.exercises;

public class Ex05_CreatingVariable { //Saving Information in Variables

	public static void main(String[] args) {

		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;

		x = 10;
		y = 400;
		age = 31;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;

		firstName = "Stephen";
		lastName = "Jaromack";
		title = "Mr.";

		System.out.println("The variable x contains " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("My name is " + title + " " + firstName + " " + lastName + ", and I am " + age + " years old.");

	}

}
