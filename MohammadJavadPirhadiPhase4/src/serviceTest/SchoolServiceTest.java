package serviceTest;

import entities.School;

public class SchoolServiceTest 
{
	public boolean testGet()
	{
		School Hogwarts = new School("Hogwarts");
		String Expected = "Hogwarts";
		String Actual = Hogwarts.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		School Uagadou = new School("Hogwarts");
		Uagadou.setName("Uagadou");
		String Expected = "Uagadou";
		String Actual = Uagadou.getName();
		return (Actual.equals(Expected));
	}
}
