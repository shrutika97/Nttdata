package com.exception;

public class Example {
	
//	Exception e;
//	NullPointerException e1;
//	ClassNotFoundException e2;
	
	void cal(int a) throws Exception
	{
		System.out.println("Value of cal after a"+ a/0);
		
		
		System.out.println("After Exception");
	}
	
	/*
	 * void cal(int a) { try { System.out.println("Value of cal after a"+ a/0); }
	 * catch(ArithmeticException e) { e.printStackTrace(); }
	 * System.out.println("After Exception"); }
	 * 
	 * public static void main(String[] args) {
		Example e=new Example();
		e.cal(10);
	 */
	public static void main(String[] args) {
		Example e=new Example();
		try {
		e.cal(10);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
			
		}
		finally {
			System.out.println("After Exception Fianlly Block");
		}
		System.out.println("After Exception");
	}

}
