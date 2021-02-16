package com.tenFeb;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		System.out.println("Enter numbers of francs to be converted to U.S Dollors");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		double d;
		d=i/(6.85062);
		System.out.println("After conversion the equivalent amount in U.S dollors is: "+d+" Dollars ");
	}

}