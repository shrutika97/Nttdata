package com.files;
import java.io.*;
import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID=1L;
	int id;
	String name;
	transient String address;
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public static void main(String args[]) {
		Customer se=new Customer(1,"Shrutika","Ghaziabad");
		FileOutputStream fo=null;
		//serialization
		try {
			fo=new FileOutputStream("abc.txt");
			ObjectOutputStream ob=new ObjectOutputStream(fo);
			ob.writeObject(se);
			System.out.println("Success");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fo.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		//deserialization
		ObjectInputStream oin;
		try {
			oin=new ObjectInputStream(new FileInputStream("abc.txt"));
			Customer se1=(Customer)oin.readObject();
			System.out.println("details of customer after deserialization");
			System.out.println(se1.id+" "+se1.name+" "+se1.address);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	

}