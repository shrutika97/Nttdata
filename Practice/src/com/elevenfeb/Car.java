package com.elevenfeb;

public class Car {
	
	String carName;
	double price;
	String color;
	String companyName;
	Engine engine;
	public Car(String carName, double price, String color, String companyName, Engine engine) {
		super();
		this.carName = carName;
		this.price = price;
		this.color = color;
		this.companyName = companyName;
		this.engine = engine;
	}
	
	void printDetailsOfCar() {
		System.out.println("Car details");
		System.out.println("Car Name: "+carName+"\t Car Price :"+price+"\t Car Company: "+color+"\t Company Name: "+companyName);
		System.out.println("Car Engine details: "+engine.typeOfEngine+"\t Numer of strokes: "+engine.NumberOfStrokes+"\t Car Milage: "+engine.milage+"\t Torqueof a Car's Engine is: "+engine.torque);
	}
	
}
