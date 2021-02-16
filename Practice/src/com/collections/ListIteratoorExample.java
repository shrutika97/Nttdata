package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratoorExample {

public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(null);
		System.out.println("The size of list "+arr.size());
		ListIterator<Integer> itr=arr.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("backward direction-----------------");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
}
}