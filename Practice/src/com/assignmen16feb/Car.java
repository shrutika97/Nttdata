package com.assignmen16feb;

import com.collections.HashStudent;

public class Car implements Comparable<Car>{
	private int modal_no;
	private String brand;
	public Car(int modal_no, String brand) {
		super();
		this.modal_no = modal_no;
		this.brand = brand;
	}
	public int getModal_no() {
		return modal_no;
	}
	public void setModal_no(int modal_no) {
		this.modal_no = modal_no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		if(o.modal_no<this.modal_no)
		{
			return -1;
		}
		else if(o.modal_no>this.modal_no)
		{
			return 1;
		}
		return 0;
		
	}
	@Override
	public String toString() {
		return "Car [modal_no=" + modal_no + ", brand=" + brand + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + modal_no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (modal_no != other.modal_no)
			return false;
		return true;
	} 

}
