package com.exception;

public class Bank {
	
	void greetUsers()
	{
		System.out.println(" Welcome to the ABC bank");
	}
	
	void transaction(User user1,User user2,double amount) {
	
	if(user1.getAccount().getAccountBalance()<amount)
	{
		try {
		throw new InsufficientBalanceAmount("Insufficient");
		}
		catch(InsufficientBalanceAmount e) {
			e.printStackTrace();
		}
	}
	else
	{
		double u1d=user1.getAccount().getAccountBalance()-amount;
		user1.getAccount().setAccountBalance(u1d);
		double u2c=user2.getAccount().getAccountBalance()+amount;
		user2.getAccount().setAccountBalance(u2c);
		
	}

}
}