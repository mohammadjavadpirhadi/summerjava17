package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentOutput 
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
		String WriteThis="TEST";
		BufferedWriter StudentWriter=new BufferedWriter(new FileWriter(StudentDB));
		StudentWriter.write(everything+WriteThis);
		StudentWriter.close();
	}
}
