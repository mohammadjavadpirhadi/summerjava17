package entities;

import java.util.Map;

public class Professor extends Person
{
	private Map<Integer,Course> _courses;	//The list of courses and the year he/she taught them
	private String _notes;	//If he/she has any special abilities or something noteworthy it is mentioned here
	/* CONSTRUCTORS */
	public Professor() 
	{
		super();
		_notes="";
		_courses=null;
	}
	public Professor(String name, House house, BloodStatus blood, School school, String birthday) 
	{
		super(name, house, blood, school, birthday);
	}
	/* GETTERS & SETTERS */
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
