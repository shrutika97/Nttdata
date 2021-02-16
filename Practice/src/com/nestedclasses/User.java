package com.nestedclasses;

public class User {
	
	private int userId;
	private String userName;
	private int pinNumber;
	
	public User(int userId, String userName, int pinNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pinNumber = pinNumber;
	}

	
	class CreditCard{
		
		
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
			if(userId==100 && pinNumber==1010)
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
