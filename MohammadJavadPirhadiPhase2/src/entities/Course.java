package entities;

import java.util.Vector;

public class Course 
{
	public String _name;
	public Grades _minGrade;
	public Professor _professorName;
	public int _year;
	public Vector<Students> _studentNames;
	public Course(String name)
	{
		_name=name;
		_minGrade=null;
		_professorName=null;
		_year=0;
		_studentNames=new Vector<Students>();
	}
	public Course(String name,Professor professor,Grades minGrade,int year)
	{
		_name=name;
		_minGrade=minGrade;
		_professorName=professor;
		_year=year;
	}
	public String getName()
	{
		return _name;
	}
	public void setName(String name)
	{
		_name=name;
	}
	public Grades getMinGrade()
	{
		return _minGrade;
	}
	public void setMinGrade (Grades minGrade)
	{
		_minGrade=minGrade;
	}
	public Professor getProfessorName()
	{
		return _professorName;
	}
	public void setProfessorName(Professor professorNames)
	{
		_professorName=professorNames;
	}
	public int getYear()
	{
		return _year;
	}
	public void setYear(int year)
	{
		_year=year;
	}
	public Vector<Students> getStudentNames()
	{
		return _studentNames;
	}
	public void setStudentNames(Vector<Students> studentNames)
	{
		_studentNames=studentNames;
	}
}
