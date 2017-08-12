package tests;

import entities.Professor;

public class ProfessorTest 
{
	public boolean testGetName()
	{
		Professor Snape = new Professor("Severus Snape");
		String expected = "Severus Snape";
		String actual = Snape.getName();
		return (actual.equals(expected));
	}
}
