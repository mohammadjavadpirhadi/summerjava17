package entitiesTest;

import entities.School;

public class SchoolTest 
{
	public boolean testGetName()
	{
		School Hogwarts = new School("Hogwarts",null,null,null,null,null);
		String Expected = "Hogwarts";
		String Actual = Hogwarts.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		School Uagadou = new School("Hogwarts",null,null,null,null,null);
		Uagadou.setName("Uagadou");
		String Expected = "Uagadou";
		String Actual = Uagadou.getName();
		return (Actual.equals(Expected));
	}
}
