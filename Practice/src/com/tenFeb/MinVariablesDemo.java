package com.tenFeb;

public class MinVariablesDemo {
	public static void main(String[] args) {
		byte minimumByte=Byte.MIN_VALUE;
		short minimumShort=Byte.MIN_VALUE;
		int minimumInteger=Integer.MIN_VALUE;
		long minimumLong=Long.MIN_VALUE;
		float minimumFloat=Float.MIN_VALUE;
		double minimumDouble=Double.MIN_VALUE;
		char aChar='S';
		boolean aBoolean=true;
		
		System.out.println("The minimum byte value is "+minimumByte);
		System.out.println("The minimum short value is "+minimumShort);
		System.out.println("The minimum Integer value is "+minimumInteger);
		System.out.println("The minimum long value is "+minimumLong);
		System.out.println("The minimum float value is "+minimumFloat);
		System.out.println("The minimum double value is "+minimumDouble);
		if(Character.isUpperCase(aChar))
		{
			System.out.println("The Character "+aChar+" is a upper case.");
		}
		else
		{
			System.out.println("The Character "+aChar+" is a lower case.");
		}
		if(aBoolean==true)
		{
			aBoolean=false;
			System.out.println("The boolean value get changed "+aBoolean);
		}
		
	}

}
