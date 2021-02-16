package com.abstractionmain;

public class Car extends Vehicle {
	
	String carName;
	
	
	public Car(int noOfWheels, int noOfSeats,String carName) {
		super(noOfWheels, noOfSeats);
		this.carName = carName;
		
	}
	
	String displayCarDetails() 
	{
		return carName;
	}
	
	
	@Override
	void startVehicle() {
		System.out.println(carName+" Car has started");
		
	}

	@Override
	void stopVehicle() {
		System.out.println(carName+" Car has stopped");
		
	}
	
}
