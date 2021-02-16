package com.nttdata;

public class Immutable {

	    public  void referenceCheck(Object x, Object y) {  
	        if (x == y) {  
	            System.out.println("Both pointing to the same reference");
	            System.out.println(x+" -> "+x.hashCode()+"          "+y+" -> "+y.hashCode());
	   
	        } else {  
	            System.out.println("Both are pointing to different reference");
	            System.out.println(x+" -> "+x.hashCode()+"           "+y+" -> "+y.hashCode());
	        }  
	    }  
	    public static void main(String[] args) {  
	    	Immutable m=new Immutable();
	    	String st1 = "Java";  
	        String st2 = "Java";  
	        System.out.println("Before Modification in st1");  
	        m.referenceCheck(st1, st2);  
	        st1 += " Technologies";  
	        System.out.println("After Modification");  
	        m.referenceCheck(st1, st2);  
	    }  
	 

}
