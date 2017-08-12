package tests;

import entities.House;

public class HouseTest 
{
	public boolean testGetName()
	{
		House Ravenclaw=new House("Ravenclaw");
		String expected = "Ravenclaw";
		String actual = Ravenclaw.getName();
		return (actual.equals(expected));
	}
}
