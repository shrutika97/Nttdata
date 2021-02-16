package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingExample {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("Hello");
		list.add("Good");
		list.add("Morning");
		
		Collections.sort(list);
		for (String str:list) {
			System.out.println(str);
		}
	}
}
