package com.tenFeb;

public class NumberHolder {
	public int anInt;
	public float aFloat;
	public NumberHolder(int anInt,float aFloat) {
		super();
		this.anInt=anInt;
		this.aFloat=aFloat;
	}
	void displayNumberHolder() {
		System.out.println("Int value is: "+anInt+" Float value is: "+aFloat);
	}
	public static void main(String[] args) {
		NumberHolder num=new NumberHolder(10,12.5f);
		num.displayNumberHolder();
	}
}
