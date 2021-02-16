package com.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ComparatorStudent1 {
	public static void main(String[] args) {
		LinkedList<Student1> arr= new LinkedList<>();
		Student1 s1=new Student1(101,"shruti");
		arr.add(s1);
		arr.add(new Student1(102,"tanu"));
		arr.add(new Student1(105,"sakshi"));
		arr.add(new Student1(104,"muskan"));
		arr.add(new Student1(102,"megha"));
		//System.out.println("The size of list "+arr.size());
		System.out.println(" Sorting Based on ID");
		Collections.sort(arr,new SortById());
		ListIterator<Student1> itr=arr.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(" Sorting Based on Name");
		Collections.sort(arr,new SortByName());
		//Collections.sort(arr,new SortByName());
		ListIterator<Student1> itr1=arr.listIterator();
	//	System.out.println("backward direction-----------------");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}

}
