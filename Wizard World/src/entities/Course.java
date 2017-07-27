package entities;

import java.util.Vector;

public class Course 
{
	public String _name;
	public char _minGrade;
	public String _professorName;
	public int _year;
	public Vector<String> _studentNames;
	public Course(String name)
	{
		_name=name;
		_minGrade='0';
		_professorName="";
		_year=0;
		_studentNames=new Vector<String>();
	}
	public Course(String name,String professor,char minGrade,int year)
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
	public char getMinGrade()
	{
		return _minGrade;
	}
	public void setMinGrade (char minGrade)
	{
		_minGrade=minGrade;
	}
	public String getProfessorName()
	{
		return _professorName;
	}
	public void setProfessorName(String professorNames)
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
	public Vector<String> getStudentNames()
	{
		return _studentNames;
	}
	public void setStudentNames(Vector<String> studentNames)
	{
		_studentNames=studentNames;
	}
}
