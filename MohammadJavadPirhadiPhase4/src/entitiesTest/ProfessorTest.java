package entitiesTest;

import entities.Professor;

public class ProfessorTest 
{
	public boolean testGetName()
	{
		Professor Snape = new Professor("Severus Snape",null,null,null,null);
		String Expected = "Severus Snape";
		String Actual = Snape.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Professor Hagrid = new Professor("Severus Snape",null,null,null,null);
		Hagrid.setName("Rubeus Hagrid");
		String Expected = "Rubeus Hagrid";
		String Actual = Hagrid.getName();
		return (Actual.equals(Expected));
	}
}
