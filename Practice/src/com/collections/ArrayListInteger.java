package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInteger {
public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(null);
		System.out.println("The size of list "+arr.size());
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		for(Integer integer: arr)
//		{
//			System.out.println(integer);   //enhanced for loop
//		}
	}

}
