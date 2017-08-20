package serviceTest;

import entities.*;

public class StudentServiceTest 
{
	public boolean testGet()
	{
		Students Potter = new Students("Harry Potter",null,null,null,null,null,null);
		String Expected = "Harry Potter";
		String Actual = Potter.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		Students Weasley = new Students("Harry Potter",null,null,null,null,null,null);
		Weasley.setName("Ginny Weasley");
		String Expected = "Ginny Weasley";
		String Actual = Weasley.getName();
		return (Actual.equals(Expected));
	}
}
