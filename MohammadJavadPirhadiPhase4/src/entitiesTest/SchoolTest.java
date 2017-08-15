package entitiesTest;

import entities.School;

public class SchoolTest 
{
	public boolean testGetName()
	{
		School Hogwarts = new School("Hogwarts");
		String Expected = "Hogwarts";
		String Actual = Hogwarts.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		School Uagadou = new School("Hogwarts");
		Uagadou.setName("Uagadou");
		String Expected = "Uagadou";
		String Actual = Uagadou.getName();
		return (Actual.equals(Expected));
	}
}
