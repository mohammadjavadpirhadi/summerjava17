package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HouseOutput 
{
	public static void main(String args[]) throws IOException
	{
		String everything="";
		File HouseDB = new File("C:/Users/JAVAD/Desktop/JAVA Programing/Session 3/Phase 2/HouseDB.txt");
		BufferedReader HouseReader=new BufferedReader(new FileReader(HouseDB));
		try
		{
		StringBuilder HouseString=new StringBuilder();
		String Line= HouseReader.readLine();
		while (Line!=null)
		{
			HouseString.append(Line);
			HouseString.append(System.lineSeparator());
			Line=HouseReader.readLine();
		}
		everything = HouseString.toString();
		}
		finally
		{
			HouseReader.close();
		}
		String WriteThis="TEST";
		BufferedWriter HouseWriter=new BufferedWriter(new FileWriter(HouseDB));
		HouseWriter.write(everything+WriteThis);
		HouseWriter.close();
	}
}
