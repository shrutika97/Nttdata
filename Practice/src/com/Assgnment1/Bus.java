package com.Assgnment1;

public class Bus extends Vehicle{
	int numWheels;
	int numSeats;
	public Bus(int numWheels,int numSeats,int vehicleNo,double price)
	{
		super(vehicleNo,price);
		this.numWheels=numWheels;
		this.numSeats=numSeats;
	}
	

}
