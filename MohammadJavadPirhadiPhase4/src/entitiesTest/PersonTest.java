package entitiesTest;

import entities.Person;

public class PersonTest 
{
	public boolean testGetName()
	{
		Person Dumbledore = new Person("Albus Dumbledore",null,null,null,null);
		String Expected = "Albus Dumbledore";
		String Actual = Dumbledore.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Person Delacour = new Person("Fleur Delacour",null,null,null,null);
		Delacour.setName("Fleur Delacour");
		String Expected = "Fleur Delacour";
		String Actual = Delacour.getName();
		return (Actual.equals(Expected));
	}
}
