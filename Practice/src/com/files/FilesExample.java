package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesExample {
	
	void writeToFile()
	{
		FileOutputStream fout=null;
		BufferedOutputStream bfout=null;
		String s="Hi welcome to file writing hello";
		
		byte []b=s.getBytes();
		try {
			 fout=new FileOutputStream("test.txt");   //it will automatcally create if it is not there
			// fout=new FileOutputStream("test.txt",true);//to append the text
			 bfout=new BufferedOutputStream(fout);
			 fout.write(b);
			bfout.flush();
			System.out.println("written successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	void readFromFile()
	{
		FileInputStream fin=null;
		BufferedInputStream bfin=null;
		try {
		fin=new FileInputStream("test.txt");
		bfin=new BufferedInputStream(fin);
		int i=0;
		while((i=bfin.read())!=-1)
		{
			System.out.print((char)i);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			fin.close();
			bfin.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
public static void main(String[] args) {
	FilesExample f=new FilesExample();
	f.writeToFile();
	f.readFromFile();
	
	
}
}
