package serviceTest;

import entities.*;

public class ProfessorServiceTest 
{
	public boolean testGet()
	{
		Professor Snape = new Professor("Severus Snape",null,null,null,null);
		String Expected = "Severus Snape";
		String Actual = Snape.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		Professor Hagrid = new Professor("Severus Snape",null,null,null,null);
		Hagrid.setName("Rubeus Hagrid");
		String Expected = "Rubeus Hagrid";
		String Actual = Hagrid.getName();
		return (Actual.equals(Expected));
	}
}
