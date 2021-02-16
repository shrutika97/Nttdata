package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		
	//	LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
	//	TreeMap<Integer, String> map=new TreeMap<>();   //null keys cannot be there
		HashMap<Integer, String> map=new HashMap<>();
		map.put(101,"One");
		map.put(101,"Two");
		map.put(303,null);
		map.put(323,null);
		map.put(456,"Six");
		map.put(890,"Six");
		map.put(null,"Seven");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
