package com.nestedclasses;

import com.nestedclasses.User.CreditCard;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 user=new User1(10,"Shrutika",1010);
		User1.CreditCard creditCard=new User1.CreditCard(62829,1000.1,64.8);
		creditCard.creditBalance();
	}

}


//static inner class