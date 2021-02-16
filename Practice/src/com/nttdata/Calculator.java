package com.nttdata;

public class Calculator {
	public void doNothing()
	{
		System.out.println("Nothing to do...");
	}
	public void addSelf(int x)
	{
		System.out.println(x+x);
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	public void div(int x,int y)
	{
		System.out.println(x/y);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.doNothing();
		c.addSelf(5);
		c.sub(100,10);
		c.add(10, 20);
		c.mul(2, 6);
		c.div(10, 4);
		
	}
}
