package com.exception;

public class NullPointer {
	void cal(int a)throws Exception

	{
		String s="hu";
		Integer.parseInt(s); //NumberFormatException
		
		
	String s1=null;
	s1.length();       //Null pointer exception
	
	int a1[]=new int[5];
	a1[6]=10;                   //Array out of box
	
	}
	public static void main(String[] args) throws Exception {
		NullPointer n=new NullPointer();
		n.cal(10);
		
	}
	
}
