package com.smj7v3.exercises;

public class Ex36_HeronsFormula { //Returning a Value from a Function

	public static void main(String[] args) {
		double a, g;
		String tws = "A triangle with sides ";
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3, 3, 3 has an area of " + a);
		
		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3, 4, 5 has an area of " + a);
		
		a = triangleArea(7, 8, 9);
		System.out.println(tws + "7, 8, 9 has an area of " + a);
		
		a = triangleArea(9, 9, 9);
		System.out.println(tws + "7, 8, 9 has an area of " + a);
		
		System.out.println(tws + "5, 12, 13 has an area of " + triangleArea(5, 12, 13));
		System.out.println(tws + "10, 9, 11 has an area of " + triangleArea(10, 9, 11));
		System.out.println(tws + "8, 15, 17 has an area of " + triangleArea(8, 15, 17));
	}
	
	public static double triangleArea(int a, int b, int c) {
		double s, A;
		
		s = (a + b + c)/2.0;
		A = Math.sqrt(s*(s - a)*(s - b)*(s - c));
		return A;
	}

}
