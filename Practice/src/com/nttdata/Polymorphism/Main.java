package com.nttdata.Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();  //example of method over loading also cakked compiled time polymorphism and need one one class
		cal.area(10);
		cal.area(10, 20);
		double result=cal.area(3,4, 5);
		System.out.println("Are of cuboid:"+result);
		
		Child c=new Child();  //example of overriding , method name should be same
		c.greet();       //if there is nothing in the child class then it will call by the parent class

	}

}
