package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListStudentSorting {
	public static void main(String[] args) {
		LinkedList<Student1> arr= new LinkedList<>();
		Student1 s1=new Student1(101,"shruti");
		arr.add(s1);
		arr.add(new Student1(102,"tanu"));
		arr.add(new Student1(105,"sakshi"));
		arr.add(new Student1(104,"muskan"));
		arr.add(new Student1(102,"megha"));
		System.out.println("The size of list "+arr.size());
		ListIterator<Student1> itr=arr.listIterator();
		Collections.sort(arr);
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
