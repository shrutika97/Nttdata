package com.elevenfeb;

public class Engine {
	
	String typeOfEngine;
	int NumberOfStrokes;
	int milage;
	int torque;
	public Engine(String typeOfEngine, int numberOfStrokes, int milage, int torque) {
		
		this.typeOfEngine = typeOfEngine;
		NumberOfStrokes = numberOfStrokes;
		this.milage = milage;
		this.torque = torque;
	}
}
