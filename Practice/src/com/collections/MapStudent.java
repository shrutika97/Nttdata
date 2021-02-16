package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapStudent {
	public static void main(String[] args) {
		
	//	LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
		TreeMap<Integer, HashStudent> map=new TreeMap<>();   //null keys cannot be there
	//	HashMap<Integer, String> map=new HashMap<>();
		map.put(101,new HashStudent(102,"tanu"));
		map.put(102,new HashStudent(103,"tanu"));
		map.put(303,new HashStudent(104,"manu"));
		map.put(323,new HashStudent(103,"sakshi"));
		
		
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		if(map.containsKey(101))
		{
			System.out.println("The value is : "+ map.get(101));
		}
		
	}

}
