package com.elevenfeb;

public class Customer {
	String custPhone;
	String custEmail;
	int custId;
	String custName;
	String customerAddress;
	public Customer(int custId,String custName,String customerAddress)
	{
		super();
		this.custId=custId;
		this.custName=custName;
		this.customerAddress=customerAddress;

	}
	
	
	
	void details() {
		System.out.println("Customer ID is : "+custId); 
		  
	    System.out.println("Name of a Customer is : "+custName); 
	    
	    System.out.println("Address of a Customer is : "+customerAddress); 
	 
	}
	
	

}
