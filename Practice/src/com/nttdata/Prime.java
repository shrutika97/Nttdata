package com.nttdata;

public class Prime {
	public static void main (String[] args)
	   {		
	       int i;
	       int n =0;
	       String  prime = "";

	       for (i = 100; i <= 300; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(n =i; n>=1; n--)
	          	{
	        	  	if(i%n==0)
	             	{
	            	 	count += 1;
	             	}
	          	}
	          if (count ==2)
	          {
		     //Appended the Prime number to the String
		     prime = prime + i + " ";
	          }	
	       }	
	       System.out.println("Prime numbers from 100 to 300 are :");
	       System.out.println(prime);
	   }

}
