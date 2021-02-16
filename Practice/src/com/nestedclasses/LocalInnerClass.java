package com.nestedclasses;

public class LocalInnerClass {
	private int data;
	public LocalInnerClass(int data) {
		super();
		this.data = data;
	}
	
	void getDataOfLocalClass()
	{
		class Inner{
			void dataRetrive()
			{
				System.out.println("Data from LocalInner class "+data);
			}
		}
		Inner inner=new Inner();
		inner.dataRetrive();
	}

}



//it is called local coz nested class is build inside the method