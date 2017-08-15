package serviceTest;

import entities.Students;

public class StudentServieTest 
{
	public boolean testGetName()
	{
		Students Potter = new Students("Harry Potter");
		String Expected = "Harry Potter";
		String Actual = Potter.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Students Weasley = new Students("Harry Potter");
		Weasley.setName("Ginny Weasley");
		String Expected = "Ginny Weasley";
		String Actual = Weasley.getName();
		return (Actual.equals(Expected));
	}
}
