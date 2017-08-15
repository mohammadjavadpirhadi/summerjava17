package entitiesTest;

import entities.Course;

public class CourseTest 
{
	public boolean testGetName()
	{
		Course Potions = new Course("Potions");
		String Expected = "Potions";
		String Actual = Potions.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Course Flying = new Course("Potions");
		Flying.setName("Flying");
		String Expected = "Flying";
		String Actual = Flying.getName();
		return (Actual.equals(Expected));
	}
}
