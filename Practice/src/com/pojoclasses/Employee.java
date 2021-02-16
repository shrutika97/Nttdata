package com.pojoclasses;

public class Employee {
 private int emplyeeId;
 private String employeeNmae;
 private String employeeAddress;
 @Override
public String toString() {
	return "Employee [emplyeeId=" + emplyeeId + ", employeeNmae=" + employeeNmae + ", employeeAddress="
			+ employeeAddress + "]";
}
public int getEmplyeeId() {
	return emplyeeId;
}
public void setEmplyeeId(int emplyeeId) {
	this.emplyeeId = emplyeeId;
}
public String getEmployeeNmae() {
	return employeeNmae;
}
public void setEmployeeNmae(String employeeNmae) {
	this.employeeNmae = employeeNmae;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}

public Employee(int emplyeeId, String employeeNmae, String employeeAddress) {
	super();
	this.emplyeeId = emplyeeId;
	this.employeeNmae = employeeNmae;
	this.employeeAddress = employeeAddress;
}
}
