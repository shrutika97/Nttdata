package com.tenFeb;

public class CountInstance {
		static int c=0;
		CountInstance()
		{
			c++;
		}
	public static void main(String[] args) {
		CountInstance c1=new CountInstance();
		CountInstance c2=new CountInstance();
		System.out.println("Total instances: "+CountInstance.c);
	}

}
