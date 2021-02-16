package com.collections;

public class Student1 implements Comparable<Student1> {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		if(o.id<this.id)
		{
			return 1;
		}
		else if(o.id>this.id)
		{
			return -1;
		}
		return 0;
	}

}
