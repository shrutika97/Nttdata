package com.elevenfeb;

public class Client {
	public static void main(String[] args) {
		
		SpecialUser s=new SpecialUser("Shrutika",3.5);
		s.greeting();          //mutlilevel inheritance
		s.printDetailsOfSpecialUser();       //single level inheritance
	
		
	
	}
	
	

}

/*
 * concrete classes are the one whose we can make an object
	till now we have made all concrete classes
	in the inheritance ,parent class can be abstract classes or the interfaces only
	concrete classes , abstract class and interfaces all are different
	In inhertance(aquire the property of parent class to child class provided no encapsulation and it is used for code reuseabilty
	
	
 */
