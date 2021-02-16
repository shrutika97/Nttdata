package com.nttdata;
import java.util.Arrays;
public class Same {
	
	public void areSame(Integer arr[])
	    {
	       Integer first = arr[0];
	       for (int i=1; i<arr.length; i++)
	    	   
	           if (arr[i] != first)
	           {
	        	   System.out.println("Elements are Different");
	        	   break;
	           }
	           else	{
	        	   System.out.println("All Elements are Same");
	        	   break;
	           }
	        	   
	    }
	 
	 
	public static void main(String[] args)
	    {
		  Same s=new Same();
	        Integer[] arr = { 10,10,10,10 };
	        s.areSame(arr);
	       
	            
	    }
	}

