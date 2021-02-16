package com.elevenfeb;

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine=new Engine("Petrol",10,120,23);
		Car car=new Car("Hundai",100000.8,"red","Hundai Manufacturer",engine);
		car.printDetailsOfCar();      //has a relationship
	}

}
