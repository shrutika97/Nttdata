package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetStudent {
	public static void main(String[] args) {
	//	HashSet<HashStudent> h=new HashSet<>();
	//	TreeSet<HashStudent> h=new TreeSet<>();
		LinkedHashSet<HashStudent> h=new LinkedHashSet<>();
		
		
		HashStudent s1=new HashStudent(101,"shruti");
		h.add(s1);
		h.add(new HashStudent(102,"tanu"));
		h.add(new HashStudent(102,"tanu"));
		h.add(new HashStudent(102,"manu"));
		h.add(new HashStudent(103,"sakshi"));
		h.add(new HashStudent(104,"muskan"));
		h.add(new HashStudent(105,"megha"));
		
		Iterator<HashStudent> itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	

}



