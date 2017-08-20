package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CourseInput 
{
	public static void main(String args[]) throws IOException
	{
		String everything="";
		File CourseDB = new File("C:/Users/JAVAD/Desktop/JAVA Programing/Session 3/Phase 2/CourseDB.txt");
		BufferedReader CourseReader=new BufferedReader(new FileReader(CourseDB));
		try
		{
		StringBuilder CourseString=new StringBuilder();
		String Line= CourseReader.readLine();
		while (Line!=null)
		{
			CourseString.append(Line);
			CourseString.append(System.lineSeparator());
			Line=CourseReader.readLine();
		}
		everything = CourseString.toString();
		}
		finally
		{
		CourseReader.close();
		}
		System.out.println(everything);
	}
}
