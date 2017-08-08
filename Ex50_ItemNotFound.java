package com.smj7v3.exercises;

import java.util.Scanner;

public class Ex50_ItemNotFound { //Saying Something is NOT in an Array

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		String[] heroes = {
				"Abderus", "Achilles", "Aeneas", "Aeneas", "Ajax", "Amphitryon",
				"Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
				"Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
				"Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
		};
		String guess;
		boolean found;
		
		System.out.println("Pop Quiz!");
		System.out.print("Name any *mortal* hero from Greek mythology: ");
		guess = keyboard.next();
		
		found = false;
		for (String hero : heroes) {
			if (guess.equals(hero)) {
				System.out.println("That's one of them!");
				found = true;
			}
		}
		
		if (found == false) {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}

}
