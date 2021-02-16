package com.Assgnment1;

public class Car extends Vehicle{
	int numWheels;
	int numSeats;
	public Car(int numWheels,int numSeats,int vechicleNo,double price)
	{
		super(vechicleNo,price);
		this.numWheels=numWheels;
		this.numSeats=numSeats;
	}
	

}

