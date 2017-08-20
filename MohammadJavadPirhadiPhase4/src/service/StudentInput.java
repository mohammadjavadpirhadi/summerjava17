package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StudentInput 
{
	public static void main(String args[]) throws IOException
	{
		String everything="";
		File StudentDB = new File("C:/Users/JAVAD/Desktop/JAVA Programing/Session 3/Phase 2/StudentDB.txt");
		BufferedReader StudentReader=new BufferedReader(new FileReader(StudentDB));
		try
		{
		StringBuilder StudentString=new StringBuilder();
		String Line= StudentReader.readLine();
		while (Line!=null)
		{
			StudentString.append(Line);
			StudentString.append(System.lineSeparator());
			Line=StudentReader.readLine();
		}
		everything = StudentString.toString();
		}
		finally
		{
			StudentReader.close();
		}
		System.out.println(everything);
	}
}
