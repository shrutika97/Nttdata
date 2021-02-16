package com.Assignment2;

public class Client {
	public static void main(String[] args) {
		Car car = new Car(4, 5);
		Bus bus = new Bus(6,35);
		Vehicle veh = new Vehicle(car,bus,98373, 500000.00,"Car");
		veh.printDetails();
		
		Vehicle veh1 = new Vehicle(car, bus, 88888, 900000.00,"Bus");
		veh1.printDetails();


	}
}
