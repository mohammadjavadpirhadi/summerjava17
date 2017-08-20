package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProfessorOutput 
{
	public static void main(String args[]) throws IOException
	{
		String everything="";
		File ProfessorDB = new File("C:/Users/JAVAD/Desktop/JAVA Programing/Session 3/Phase 2/ProfessorDB.txt");
		BufferedReader ProfessorReader=new BufferedReader(new FileReader(ProfessorDB));
		try
		{
		StringBuilder ProfessorString=new StringBuilder();
		String Line= ProfessorReader.readLine();
		while (Line!=null)
		{
			ProfessorString.append(Line);
			ProfessorString.append(System.lineSeparator());
			Line=ProfessorReader.readLine();
		}
		everything = ProfessorString.toString();
		}
		finally
		{
			ProfessorReader.close();
		}
		String WriteThis="TEST";
		BufferedWriter ProfessorWriter=new BufferedWriter(new FileWriter(ProfessorDB));
		ProfessorWriter.write(everything+WriteThis);
		ProfessorWriter.close();
	}
}
