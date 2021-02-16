package com.abstraction;

public class Tab implements ElectronicDevice{
	
	String tname;
	double tprice;
	int tram;
	int tmemory;
	public Tab(String tname,double tprice,int tram,int tmemory)
	{
		super();
		this.tname=tname;
		this.tprice=tprice;
		this.tram=tram;
		this.tmemory=tmemory;
		
	}
	String getDetailsOfTab()
	{
		return tname;
	}
	double getPriceOfTab()
	{
		return tprice;
	}
	int getTabRam()
	{
		return tram;
	}
	int getTabGen()
	{
		return tmemory;
	}
	@Override
	public void trurnOn() {
		// TODO Auto-generated method stub
		System.out.println(tname+" TAB turned On whose price is"+tprice+" CHARGE OF ELECTRON IS "+ElectronicDevice.CHARGEOFELECTRON);
		System.out.println("TAB have the RAM of "+tram+" and the Internal Storage is "+tmemory);

		
	}
	@Override
	public void trunOff() {
		// TODO Auto-generated method stub
		System.out.println(tname+" TAB turned off");

		
	}

}
