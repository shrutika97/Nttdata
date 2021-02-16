package com.elevenfeb;

public class Student extends Object {   //object is a parent class of the java class we create
 String name;
 public Student(String string) {
	 this.name=string;
 }
 public static void main(String[] args) {
	Student student=new Student("NTTDATA");
	String s1="hello";  //creating a object by literals and s1 and s2 will refer to the same object as is already created in a pool
	System.out.println(s1.hashCode());
	String s2="hello";   //in garbage there is string constant pool by string literal ony
	System.out.println(s2.hashCode());
	String s3=new String("hello");  //storing in non constant pool
	System.out.println(s3.hashCode());//refer to same above hascode no
	System.out.println(s1.concat(s3).hashCode());
	System.out.println(s1.concat(s3));
	if(s1==s2)   
	{
		System.out.println("equal");
	}
	if(s1==s3)   //it will check the memory refrence ,it will is changed coz it is created by new 
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
	if(s1.equals(s3))  //it will check if the hashcode is same and hashcode is made by the ASCII value of the string
		
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}


	//	System.out.println(student.hashCode());
//	System.out.println(student.getClass());
//	System.out.println(student);

}
@Override
public String toString() {  //string representing of an object
	return "Name of the student is:"+name;
}
}

/* 
 
-----notes---------
if the object doesnot have any reference value then it is in the garbage collector
in garbage collector it has "finalize()" ,it is invoked each time garbage collector
clone()
equals()
notify()
notifyAll()
wait()
wait(millisc)
wait(millisec,nanosec)


another way of using object is by instanceOf

Strings:
1.stringBuffer,2.sting builder and3.string
important class of java final class
two ways of creating the string object: 1. using new and 2. string literals
as String s=new String("hello") 2.String s1="Hello"
by 2 one it check in the pool if it exits or not and if not the it will create a object in the reference pool and give the reference


*/