package com.pojoclasses;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(101,"Shrutika","Ghaziabad");
		System.out.println("Employee details: "+employee);
		employee.setEmployeeAddress("Banglore");
		System.out.println("Employee details: "+employee);
		System.out.println("Employee details: "+employee.getEmployeeNmae());
	
		Scanner sc=new Scanner(System.in);
		
	
	}

}
