package com.nestedclasses;

public class ClientLocal {
	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass(100);
		local.getDataOfLocalClass();
		
//start of example of anonymous inner class		
		Greeter greet=new Greeter() {

			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
				System.out.println("Hello shrutika");
				
			}
			
		};
		
		greet.greeting();
		
		Greeter greet1=new Greeter() {

			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("Hello shrutika");
				
			}
			
		};
		
		greet1.greeting();
	}
	//end of example of anonymous inner class
}
