package serviceTest;

import entities.School;

public class SchoolServiceTest 
{
	public boolean testGet()
	{
		School Hogwarts = new School("Hogwarts",null,null,null,null,null);
		String Expected = "Hogwarts";
		String Actual = Hogwarts.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		School Uagadou = new School("Hogwarts",null,null,null,null,null);
		Uagadou.setName("Uagadou");
		String Expected = "Uagadou";
		String Actual = Uagadou.getName();
		return (Actual.equals(Expected));
	}
}
