package entities;

import java.util.Map;

public class Professor extends Person
{
	private Map<Integer,Course> _courses;
	private String _notes;
	public Professor(String name) 
	{
		super(name);
		_notes="";
		_courses=null;
	}
	public Professor(String name, House house, BloodStatus blood, School school, String birthday) 
	{
		super(name, house, blood, school, birthday);
	}
	public Map<Integer,Course> getCourses()
	{
		return _courses;
	}
	public void setCourses(Map<Integer,Course> courses)
	{
		_courses=courses;
	}
	public String getNotes()
	{
		return _notes;
	}
	public void setNotes(String notes)
	{
		_notes=notes;
	}
}
