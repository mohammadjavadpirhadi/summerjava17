package entitiesTest;

import entities.House;

public class HouseTest 
{
	public boolean testGetName()
	{
		House Ravenclaw=new House("Ravenclaw");
		String Expected = "Ravenclaw";
		String Actual = Ravenclaw.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		House Gryffindor = new House("Ravenclaw");
		Gryffindor.setName("Gryffindor");
		String Expected = "Gryffindor";
		String Actual = Gryffindor.getName();
		return (Actual.equals(Expected));
	}
}
