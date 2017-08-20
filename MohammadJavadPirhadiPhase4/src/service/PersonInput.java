package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PersonInput 
{
	public static void main(String args[]) throws IOException
	{
		String everything="";
		File PersonDB = new File("C:/Users/JAVAD/Desktop/JAVA Programing/Session 3/Phase 2/PersonDB.txt");
		BufferedReader PersonReader=new BufferedReader(new FileReader(PersonDB));
		try
		{
		StringBuilder PersonString=new StringBuilder();
		String Line= PersonReader.readLine();
		while (Line!=null)
		{
			PersonString.append(Line);
			PersonString.append(System.lineSeparator());
			Line=PersonReader.readLine();
		}
		everything = PersonString.toString();
		}
		finally
		{
			PersonReader.close();
		}
		System.out.println(everything);
	}
}
