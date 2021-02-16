package com.nestedclasses;

public class User1 {
	
	private static int userId;
	private static String userName;
	private static int pinNumber;
	
	public User1(int userId, String userName, int pinNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pinNumber = pinNumber;
	}
	
	 static class CreditCard{
		
	//we cannot make these inner class attributes as static	
		private int cardumber;
		private double cardLimitAmount;
		private double loanAmount;

		public CreditCard(int cardumber, double cardLimitAmount, double loanAmount) {
			super();
			this.cardumber = cardumber;
			this.cardLimitAmount = cardLimitAmount;
			this.loanAmount = loanAmount;
		}
		
	private	boolean validateUserCredentials()
		{
			if(userId==10 && pinNumber==1010)
			{
				return true;
			}
			return false;
		}
	void creditBalance()
		{
			if(validateUserCredentials() == true)
			{
			double creditBalance=cardLimitAmount-loanAmount;
			System.out.println("Hello "+userName+" Your credit card balance is : "+creditBalance);
			}
			else
			{
				System.out.println("Your authentication is failed");

			}
		}
	}

}

//staic nested class
//only inner class can be static but variables of the parent class should be static