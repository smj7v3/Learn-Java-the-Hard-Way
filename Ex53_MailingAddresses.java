package com.smj7v3.exercises;

class Address { //Mailing Addresses (Records)
	String street;
	String city;
	String state;
	int zip;
}

public class Ex53_MailingAddresses {

	public static void main(String[] args) {
		Address uno, dos, tres, quattro;
		
		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city = "Miami";
		uno.state = "FL";
		uno.zip = 33179;
		
		dos = new Address();
		dos.street = "3029 Losh Lane";
		dos.city = "Crafton";
		dos.state = "PA";
		dos.zip = 28601;
		
		tres = new Address();
		tres.street = "2693 Hannah Street";
		tres.city = "Hickory";
		tres.state = "NC";
		tres.zip = 28601;
		
		quattro = new Address();
		quattro.street = "6430 Clover Farm Drive";
		quattro.city = "O'Fallon";
		quattro.state = "MO";
		quattro.zip = 63368;
		
		System.out.println(uno.street);
		System.out.println(uno.city + ", " + uno.state + " " + uno.zip);
		System.out.println("\n" + dos.street);
		System.out.println(dos.city + ", " + dos.state + " " + dos.zip);
		System.out.println("\n" +tres.street);
		System.out.println(tres.city + ", " + tres.state + " " + tres.zip);
		System.out.println("\n" + quattro.street);
		System.out.println(quattro.city + ", " + quattro.state + " " + quattro.zip);
	}

}
