package com.exception;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Account acc1=new Account(123,1000);
		
		User user1=new User("shruti","Bangalore",acc1);
		
       Account acc2=new Account(12373,102200);
		
		User user2=new User("anu","Chennai",acc2);
		
		Bank bank=new Bank();
		bank.greetUsers();
		
		System.out.println("Before transactions the account details are");
		System.out.println(user1);
		System.out.println(user2);
		
		System.out.println("After transactions the account details are");
		bank.transaction(user1,user2,500);
		System.out.println(user1);
		System.out.println(user2);
	}

}














/*
 * Exception is a built in class:lang package
it occurs at run time
herierachy............
Throwable--->Exception------>1.Checked exceptions(SQL,IO exceptions)   2.un-checkedexception runtime expections(NullPointer,ArrayIndexOutofBox,NumberFormat Exception,Arithmetic Exception)
Custom exception: can create our own exception also called user defined exception
 
try - is a block where we add codes seems to throw exception
catch- what ever exception thrown will be handled in catch block
throw-usually used to throw a user defined exception
throws- always assciated with method defination(like declare method which throws exception) 
finally-always gets executed even exception comes pr does not comes

*/