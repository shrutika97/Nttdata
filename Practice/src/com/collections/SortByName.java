package com.collections;

import java.util.Comparator;

public class SortByName implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	//	return o2.getName().compareTo(o1.getName());   //it is used for the printing in reverse
	}

}
