package com.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Laptop Name "); 
		String lname=sc.next();
		System.out.println("Enter the price");
		Double lprice = sc.nextDouble();
		System.out.println("Enter the processor"); 
		String lprocessor = sc.next();
		System.out.println("Enter the Ram"); 
		int lram = sc.nextInt();
		System.out.println("Enter the Windows Generation"); 
		int lwin_gen = sc.nextInt();
		ElectronicDevice laptop=new Laptop(lname,lprice,lprocessor,lram,lwin_gen);
		laptop.trurnOn();
		laptop.trunOff();
		System.out.println("------------------------------------------");
		System.out.println("Enter the Mobile Name "); 
		String mname=sc.next();
		System.out.println("Enter the price");
		Double mprice = sc.nextDouble();
		System.out.println("Enter the processor"); 
		String mprocessor = sc.next();
		System.out.println("Enter the Ram"); 
		int mram = sc.nextInt();
		System.out.println("Enter the Memory"); 
		int mmemory = sc.nextInt();
		ElectronicDevice mobile=new Mobile(mname,mprice,mprocessor,mram,mmemory);
		mobile.trurnOn();
		mobile.trunOff();
		System.out.println("------------------------------------------");
		System.out.println("Enter the Tab Name "); 
		String tname=sc.next();
		System.out.println("Enter the price");
		Double tprice = sc.nextDouble();
		System.out.println("Enter the Ram"); 
		int tram = sc.nextInt();
		System.out.println("Enter the Memory"); 
		int tmemory = sc.nextInt();
		ElectronicDevice tab=new Tab(tname,tprice,tram,tmemory);
		tab.trurnOn();
		tab.trunOff();
	}

}
