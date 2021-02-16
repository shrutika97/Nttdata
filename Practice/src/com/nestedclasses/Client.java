package com.nestedclasses;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User(10,"Shrutika",1010);
		User.CreditCard creditCard=user.new CreditCard(62829,1000.1,64.8);
		creditCard.creditBalance();
	}

}



//non-static or member nested class