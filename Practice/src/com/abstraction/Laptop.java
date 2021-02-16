package com.abstraction;

public class Laptop implements ElectronicDevice{
	
	String lname;
	double lprice;
	String lprocessor;
	int lram;
	int lwin_gen;
	
	public Laptop(String lname,double lprice,String lprocessor,int lram,int lwin_gen)
	{
		super();
		this.lname=lname;
		this.lprice=lprice;
		this.lprocessor=lprocessor;
		this.lram=lram;
		this.lwin_gen=lwin_gen;
		
	}
	String getDetailsOfLaptop()
	{
		return lname;
	}
	double getPriceOfLaptop()
	{
		return lprice;
	}
	String getLaptopProcessor()
	{
		return lprocessor;
	}
	int getLaptopRam()
	{
		return lram;
	}
	int getLaptopGen()
	{
		return lwin_gen;
	}
	@Override
	public void trurnOn() {
		// TODO Auto-generated method stub
		System.out.println(lname+" Laptop turned On whose price is"+lprice+" CHARGE OF ELECTRON IS "+ElectronicDevice.CHARGEOFELECTRON);
		System.out.println("Laptop Processor is "+lprocessor+" with the RAM of "+lram+" and the generation is "+lwin_gen);
		
	}
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println(lname+" Laptop turned off");

		
	}

}
