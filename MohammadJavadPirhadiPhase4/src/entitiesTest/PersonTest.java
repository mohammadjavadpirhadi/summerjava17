package entitiesTest;

import entities.Person;

public class PersonTest 
{
	public boolean testGetName()
	{
		Person Dumbledore = new Person("Albus Dumbledore");
		String Expected = "Albus Dumbledore";
		String Actual = Dumbledore.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Person Delacour = new Person("Fleur Delacour");
		Delacour.setName("Fleur Delacour");
		String Expected = "Fleur Delacour";
		String Actual = Delacour.getName();
		return (Actual.equals(Expected));
	}
}
