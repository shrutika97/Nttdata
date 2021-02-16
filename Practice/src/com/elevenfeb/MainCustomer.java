package com.elevenfeb;

import java.util.Scanner;

public class MainCustomer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Customer ID "); 
		int custId=sc.nextInt();
		System.out.println("Please Enter the Name of a Customer");
		String custName = sc.next();
		System.out.println("Please Enter the Address of a Customer"); 
		String customerAddress = sc.next();
		System.out.println("Please Enter the Phone Number of a Customer"); 
		String custPhone = sc.next();
		System.out.println("Please Enter the Email of a Customer"); 
		String custEmail = sc.next();
		
		
		PrivilagedCustomer pc=new PrivilagedCustomer(custPhone,custEmail,custId,custName,customerAddress);
		pc.details();

	}

}
