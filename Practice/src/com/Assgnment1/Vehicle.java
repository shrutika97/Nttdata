package com.Assgnment1;

public class Vehicle {
	int vehicleNo;
	double price;
	
	public Vehicle(int vehicleNo,double price)
	{
		this.vehicleNo= vehicleNo;
		this.price=price;
	}
	void vechicleBus(Object o)
	{
		Bus bus=null;
		if(o instanceof Bus)
		{
			bus=(Bus)o;
		}
		System.out.println("Bus has "+bus.numWheels+" wheels.");
		System.out.println("Bus has "+bus.numSeats+" seats.");
		System.out.println("Bus is of price "+bus.price+" .");
		System.out.println("Bus has vehicle number "+bus.vehicleNo+" .");

	}
	void vechicleCar(Object o)
	{
		Car car=null;
		if(o instanceof Car)
		{
			car=(Car)o;
		}
		System.out.println("Car has "+car.numWheels+" wheels.");
		System.out.println("Car has "+car.numSeats+" seats.");
		System.out.println("Car is of price "+car.price+" .");
		System.out.println("Car has vehicle number "+car.vehicleNo+" .");

	}
}
