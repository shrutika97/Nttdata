package com.abstractionmain;

public class Bus extends Vehicle {
	
	String busName;
	
	
	public Bus(int noOfWheels, int noOfSeats, String busName) {
		super(noOfWheels, noOfSeats);
		this.busName = busName;
	}


	
	String displayBusDetails() 
	{
		return busName;
	}

	@Override
	void startVehicle() {
		System.out.println(busName+" Bus has started");
		
	}

	@Override
	void stopVehicle() {
		System.out.println(busName+" Bus has stopped");
		
	}
	
	
	
	

}
