package com.abstractionmain;

public abstract class Vehicle {
	
	int noOfWheels;
	int noOfSeats;
	
	
	public Vehicle(int noOfWheels, int noOfSeats) {
		super();
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
		
	}
	abstract void startVehicle();
	abstract void stopVehicle();
	
	void printDetails()
	{
		System.out.println(" Welcome to Vehicle Simulation \n we have Vehicles with Number of Wheels: "+noOfWheels+" Number of Seats: "+noOfSeats);
	}
	
	

}
