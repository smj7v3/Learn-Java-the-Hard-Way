package com.smj7v3.exercises;

class Student {
	String name;
	int credits;
	double gpa;
}

public class Ex55_StudentDatabase {

	public static void main(String[] args) {
		Student[] db;
		db = new Student[4];
		
		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;
		
		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;
		
		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;
		
		db[3] = new Student();
		db[3].name = "Stephen";
		db[3].credits = 144;
		db[3].gpa = 4.17;
		
		for (int i = 0; i < db.length; i++) {
			System.out.println("Name: " + db[i].name);
			System.out.println("\tCredit hours: " + db[i].credits);
			System.out.println("\tGPA: " + db[i].gpa + "\n");
		}
		
		int maxLoc = 0;
		for (int i = 1; i < db.length; i ++) {
			if (db[i].gpa > db[maxLoc].gpa) {
				maxLoc = i;
			}	
		}
		int leastCred = 0;
		for (int i = 0; i < db.length; i++) {
			if (db[i].credits < db[leastCred].credits) {
				leastCred = i;
			}
		}
		System.out.println(db[maxLoc].name + " has the highest GPA.");
		System.out.println(db[leastCred].name + " has the fewest credits.");
	}

}
