package com.elevenfeb;

public class PrivilagedCustomer extends Customer{
	String custPhone;
	String custEmail;
	public PrivilagedCustomer(String custPhone,String custEmail,int custId,String custName,String customerAddress) {
		super(custId,custName,customerAddress);
		this.custEmail=custEmail;
		this.custPhone=custPhone; 
	}
	void details() {
		System.out.println("Customer ID is : "+custId); 
		  
	    System.out.println("Name of a Customer is : "+custName); 
	    
	    System.out.println("Address of a Customer is : "+customerAddress); 
		System.out.println("Customer Phone Number is : "+custPhone); 
		  
	    System.out.println("Customer Email is : "+custEmail); 
	 
	 
	}
	

}
