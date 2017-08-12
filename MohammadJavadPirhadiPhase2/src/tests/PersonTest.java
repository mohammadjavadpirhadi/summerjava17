package tests;

import entities.Person;

public class PersonTest 
{
	public boolean testGetName()
	{
		Person Dumbledore = new Person("Albus Dumbledore");
		String expected = "Albus Dumbledore";
		String actual = Dumbledore.getName();
		return (actual.equals(expected));
	}
}
