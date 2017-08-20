package serviceTest;

import entities.*;

public class PersonServiceTest 
{
	public boolean testGet()
	{
		Person Dumbledore = new Person("Albus Dumbledore",null,null,null,null);
		String Expected = "Albus Dumbledore";
		String Actual = Dumbledore.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		Person Delacour = new Person("Fleur Delacour",null,null,null,null);
		Delacour.setName("Fleur Delacour");
		String Expected = "Fleur Delacour";
		String Actual = Delacour.getName();
		return (Actual.equals(Expected));
	}
}
