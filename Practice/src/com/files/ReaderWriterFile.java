package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterFile {
	
	void writeToFile()
	{
		FileWriter fw=null;
		try {
			fw = new FileWriter("abc.txt");
			fw.write("Hi this is using the file writer");
			System.out.println("Success");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally
		{
			try {
			fw.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}	
	
	void readFromFile()
	{
		FileReader fr=null;
		try {
			fr = new FileReader("abc.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
			fr.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ReaderWriterFile rf=new ReaderWriterFile();
		rf.writeToFile();
		rf.readFromFile();
	}
}
