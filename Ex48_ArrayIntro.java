package com.smj7v3.exercises;

public class Ex48_ArrayIntro {

	public static void main(String[] args) {
		String[] planets = {"Mercury", "Venus", "Earth", "Mars",
							"Jupiter", "Saturn", "Uranus", "Neptune"};
		
		for (String p : planets) {
			System.out.println(p + "\t" + p.toUpperCase());
		}

	}

}
