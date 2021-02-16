package com.collections;

import java.util.Comparator;

public class SortById implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId())
		{
			return 1;
		}
		else if(o1.getId()<o2.getId())
		{
			return -1;
		}
		return 0;
	}

}
