package tests;

import entities.Course;

public class CourseTest 
{
	public boolean testGetName()
	{
		Course Potions = new Course("Potions");
		String expected = "Potions";
		String actual = Potions.getName();
		return (actual.equals(expected));
	}
}
