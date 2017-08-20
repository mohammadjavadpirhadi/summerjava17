package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SchoolOutput 
{
	public static void main(String args[]) throws IOException
	{
		String everything="";
		File SchoolDB = new File("C:/Users/JAVAD/Desktop/JAVA Programing/Session 3/Phase 2/SchoolDB.txt");
		BufferedReader SchoolReader=new BufferedReader(new FileReader(SchoolDB));
		try
		{
		StringBuilder SchoolString=new StringBuilder();
		String Line= SchoolReader.readLine();
		while (Line!=null)
		{
			SchoolString.append(Line);
			SchoolString.append(System.lineSeparator());
			Line=SchoolReader.readLine();
		}
		everything = SchoolString.toString();
		}
		finally
		{
			SchoolReader.close();
		}
		String WriteThis="TEST";
		BufferedWriter SchoolWriter=new BufferedWriter(new FileWriter(SchoolDB));
		SchoolWriter.write(everything+WriteThis);
		SchoolWriter.close();
	}
}
