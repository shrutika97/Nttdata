package com.elevenfeb;

public class BufferString {
	String name;
	 public BufferString(String string) {
		 this.name=string;
	 }
	 public static void main(String[] args) {
		 BufferString student=new BufferString("NTTDATA");
		 StringBuffer sb=new StringBuffer("Hello");
		 System.out.println(sb.hashCode());
		 System.out.println(sb.charAt(2));
		 System.out.println(sb.append("D"));
		 System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		 System.out.println(sb.append("Shrutika"));
		 System.out.println(sb.lastIndexOf("Shrutika"));
		 System.out.println(sb.length());
		 System.out.println(sb.insert(3, "T"));
		 System.out.println(sb.replace(1,3,"Java"));
		 System.out.println(sb.delete(1,3));
		 System.out.println(sb.reverse());
//		 StringBuffer sb1=new StringBuffer("Hello");
//		 System.out.println(sb1.hashCode());
// 		 StringBuilder sb=new StringBuilder("Hello");
//		 System.out.println(sb.hashCode());
//		 StringBuilder sb1=new StringBuilder("Hello");
//		 System.out.println(sb1.hashCode());
//		 int [] array=new int[10];
//		 for(int i=0;i<array.length;i++)
//		 {
//			 array[i]=i;
//			 System.out.println("Array Value: " +array[i]);
//		 }
}
}


/*
 * in threadsafe use string builder otherwise string buffer
 * string buffer is making a reserve a memory and o one can access it
 * drawback of array is it is not dynamically changing the size and can add homogenoues data only
 */