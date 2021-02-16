package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String name;
	transient String address;  //if we dont want anything to deserialize so use it

	private static final long serialVersionUID=1L;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public static void main(String[] args) {
	Employee employee=new Employee(10,"Anu","Bangalore");
	
	//serialization
	FileOutputStream fo=null;
	try {
		fo=new FileOutputStream("serial.txt");
		ObjectOutputStream ob=new ObjectOutputStream(fo);
		ob.writeObject(employee);
		System.out.println("Success");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			fo.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
//deserialization		
		ObjectInputStream oin;
		try {
			oin = new ObjectInputStream(new FileInputStream("serial.txt"));
			Employee employee1=(Employee)oin.readObject();  //downcasting otherwise it will return object of any kind
		
			System.out.println("Details of empoyee after Deserialization");
			System.out.println(employee1.id+"---"+employee1.name+"---"+employee1.address);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


//any static is also not be anble to serialize and deserialization
//use it with database
