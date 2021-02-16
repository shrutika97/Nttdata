package com.abstractionmain;


public class Client {
	public static void main(String[] args) {
		
		Vehicle car=new Car(4,4," Nexon"); // upcasting
		car.printDetails();

		
		car.startVehicle();
		car.stopVehicle();
		System.out.println("-------------------------------------");
		Vehicle bus=new Bus(4,32," VOLVO");
		bus.printDetails();
		
		bus.startVehicle();
		bus.stopVehicle();
	}

}
