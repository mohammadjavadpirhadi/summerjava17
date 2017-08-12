package tests;

import entities.Students;

public class StudentsTest 
{
	public boolean testGetName()
	{
		Students Potter = new Students("Harry Potter");
		String expected = "Harry Potter";
		String actual = Potter.getName();
		return (actual.equals(expected));
	}
}
