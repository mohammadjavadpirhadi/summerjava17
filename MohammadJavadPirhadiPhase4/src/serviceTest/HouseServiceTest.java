package serviceTest;

import entities.*;

public class HouseServiceTest 
{
	public boolean testGet()
	{
		House Ravenclaw=new House("Ravenclaw",null,null,null,null,null);
		String Expected = "Ravenclaw";
		String Actual = Ravenclaw.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		House Gryffindor = new House("Ravenclaw",null,null,null,null,null);
		Gryffindor.setName("Gryffindor");
		String Expected = "Gryffindor";
		String Actual = Gryffindor.getName();
		return (Actual.equals(Expected));
	}
}
