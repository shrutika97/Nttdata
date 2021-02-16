package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListStudent {
public static void main(String[] args) {
		
		ArrayList<Student> arr= new ArrayList<>();
		Student s1=new Student(101,"shruti");
		arr.add(s1);
		arr.add(new Student(102,"tanu"));
		arr.add(new Student(103,"sakshi"));
		arr.add(new Student(104,"muskan"));
		arr.add(new Student(105,"megha"));
		System.out.println("The size of list "+arr.size());
		ListIterator<Student> itr=arr.listIterator();
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
