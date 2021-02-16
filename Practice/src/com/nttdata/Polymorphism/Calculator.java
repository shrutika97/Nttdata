package com.nttdata.Polymorphism;

public class Calculator {
	
	void area(int length) {
		System.out.println("Area of square is:"+length*length);
		
	}
	int area(int length,int breadth)
	{
		return length*breadth;
	}
	double area(int len,int width,int height) {
		return len*width*height;
	}
	int area(int l,float b)//it will work coz it is having diff datatype
	{
		return l;
	}
}







/*
 * Polymorphisn-Many form of a same kind(one into many forms
 * 2 types-compile time (overloading) and runtime overloading(overding exist when there is a parent and child relationship
 * 
 * method is overloaded,if name is same(same method signature),no matter what is access specifier,no matter what is return type
 * but parameters should be diff
 */