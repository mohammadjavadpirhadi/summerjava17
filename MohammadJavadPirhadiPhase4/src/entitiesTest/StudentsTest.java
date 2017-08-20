package entitiesTest;

import entities.Students;

public class StudentsTest 
{
	public boolean testGetName()
	{
		Students Potter = new Students("Harry Potter",null,null,null,null,null,null);
		String Expected = "Harry Potter";
		String Actual = Potter.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Students Weasley = new Students("Harry Potter",null,null,null,null,null,null);
		Weasley.setName("Ginny Weasley");
		String Expected = "Ginny Weasley";
		String Actual = Weasley.getName();
		return (Actual.equals(Expected));
	}
}
