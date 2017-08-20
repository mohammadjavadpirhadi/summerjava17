package entitiesTest;

import entities.Course;

public class CourseTest 
{
	public boolean testGetName()
	{
		Course Potions = new Course("Potions",null,null,0);
		String Expected = "Potions";
		String Actual = Potions.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSetName()
	{
		Course Flying = new Course("Potions",null,null,0);
		Flying.setName("Flying");
		String Expected = "Flying";
		String Actual = Flying.getName();
		return (Actual.equals(Expected));
	}
}
