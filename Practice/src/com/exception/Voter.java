package com.exception;

public class Voter {
	private int age;

	public Voter(int age) {
		this.age = age;
	}
	
	void validateVotingAge() throws InValidAgeException
	{
		if(age<18)
		{
			throw new InValidAgeException("Your age is not yet under Indian Voting standard !!!");
		}
	}
	public static void main(String[] args) {
		
		Voter v=new Voter(10);
		try {
			v.validateVotingAge();
		} catch (InValidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
