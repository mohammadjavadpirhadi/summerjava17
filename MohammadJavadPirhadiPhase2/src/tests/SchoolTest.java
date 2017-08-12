package tests;

import entities.School;

public class SchoolTest 
{
	public boolean testGetName()
	{
		School Hogwarts = new School("Hogwarts");
		String expected = "Hogwarts";
		String actual = Hogwarts.getName();
		return (actual.equals(expected));
	}
}
