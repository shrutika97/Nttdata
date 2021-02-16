package com.abstraction;

public class Mobile implements ElectronicDevice{
	
	String mname;
	double mprice;
	String mprocessor;
	int mram;
	int mmemory;
	public Mobile(String mname,double mprice,String mprocessor,int mram,int mmemory)
	{
		super();
		this.mname=mname;
		this.mprice=mprice;
		this.mprocessor=mprocessor;
		this.mram=mram;
		this.mmemory=mmemory;
		
	}
	String getDetailsOfMobile()
	{
		return mname;
	}
	double getPriceOfMobile()
	{
		return mprice;
	}
	String getMobileProcessor()
	{
		return mprocessor;
	}
	int getMobileRam()
	{
		return mram;
	}
	int getMobileGen()
	{
		return mmemory;
	}
	@Override
	public void trurnOn() {
		// TODO Auto-generated method stub
		System.out.println(mname+" Mobile turned On whose price is"+mprice+" CHARGE OF ELECTRON IS "+ElectronicDevice.CHARGEOFELECTRON);
		System.out.println("Mobile Processor is "+mprocessor+" with the RAM of "+mram+" and the Internal Storage is "+mmemory);

		
	}
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println(mname+" Mobile turned off");

		
	}

}
