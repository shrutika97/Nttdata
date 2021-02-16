package com.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList<>();
		arr.add(10);
		arr.add(10.2);
		arr.add("shruti");
		System.out.println("The size of list "+arr.size());
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
