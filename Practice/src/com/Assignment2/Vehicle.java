package com.Assignment2;

public class Vehicle {

	Car car;
	Bus bus;
	int vehicleNo;
	double price;
	String type;

	public Vehicle(Car car, Bus bus, int vehicleNo,double price, String type)
	{
		super();
		this.car=car;
		this.bus=bus;
		this.vehicleNo= vehicleNo;
		this.price=price;
		this.type=type;

	}

	void printDetails() {
		// TODO Auto-generated method stub
		if (type =="Bus") {
			System.out.println( type + " has "+bus.numWheels+" wheels.");
			System.out.println( type + " has "+bus.numSeats+" seats.");
			System.out.println( type + " is of price "+price+" .");
			System.out.println( type + " has vehicle number "+vehicleNo+" .");
		}

		if (type =="Car") {
			System.out.println( type + " has "+car.numWheels+" wheels.");
			System.out.println( type + " has "+car.numSeats+" seats.");
			System.out.println( type + " is of price "+price+" .");
			System.out.println( type + " has vehicle number "+vehicleNo+" .");
		}

	}
}
