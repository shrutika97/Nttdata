package com.collections;

import java.util.HashSet;

public class HashSetExample {
 public static void main(String[] args) {
	HashSet<Double> h=new HashSet<>();
	h.add(10.2);
	h.add(10.2);
	h.add(null);
	h.add(null);
	h.add(30.5);
	h.add(1.1);
	
	for(Double d:h)
	{
		System.out.println(d);
	}
}

}


//doesnot take duplicate but null is allowed but not twice
//sorting