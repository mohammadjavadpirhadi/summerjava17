package entities;

import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class House 
{
	private String _name;	//House name
	private School _school;	//the school that has this house
	private Vector<Students> _students;	//List of students in the house
	private Professor _headTeacher;	//the house�s head teacher
	private ArrayList<String> _qualities;	//List of qualities that are required to be in the house
	private Map<Integer,Students> _prefects;	//the list of prefects of the house per year
	/* CONSTRUCTORS */
	public House(String name) 
	{
		_name=name;
		_school=null;
		_students=new Vector<Students>();
		_headTeacher =null;
		_qualities=new ArrayList<String>();
		_prefects=null;
	}
	public House(String name,School school,Vector<Students> students,Professor headTeacher,ArrayList<String> qualities,Map<Integer,Students> prefects)
	{
		_name=name;
		_school=school;
		_students=students;
		_headTeacher=headTeacher;
		_qualities=qualities;
		_prefects=prefects;
	}
	/* GETTERS & SETTERS */
	public String getName()
	{
		return _name;
	}
	public void setName(String name)
	{
		_name=name;
	}
	public School getSchool()
	{
		return _school;
	}
	public void setSchool(School school)
	{
		_school=school;
	}
	public Vector<Students> getStudents()
	{
		return _students;
	}
	public void setStudents(Vector<Students> students)
	{
		_students=students;
	}
    public Professor getHeadTeacher()
    {
    	return _headTeacher;
    }
    public void setHeadTeacher(Professor headTeacher)
    {
    	_headTeacher=headTeacher;
    }
    public ArrayList<String> getQualities()
    {
    	return _qualities;
    }
    public void setQualities(ArrayList<String> qualities)
    {
    	_qualities=qualities;
    }
    public Map<Integer,Students> getPrefects()
    {
    	return _prefects;
    }
    public void setPrefects(Map<Integer,Students> prefects)
    {
    	_prefects=prefects;
    }
}
