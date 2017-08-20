package serviceTest;

import entities.Course;

public class CourseServiceTest 
{
	public boolean testGet()
	{
		Course Potions = new Course("Potions",null,null,0);
		String Expected = "Potions";
		String Actual = Potions.getName();
		return (Actual.equals(Expected));
	}
	public boolean testSet()
	{
		Course Flying = new Course("Potions",null,null,0);
		Flying.setName("Flying");
		String Expected = "Flying";
		String Actual = Flying.getName();
		return (Actual.equals(Expected));
	}
}
