package entities;

import java.util.Vector;

public class Course 
{
	private String _name;	//The name of a course
	private Grades _minGrade;	//minimum grade required in the OWLs to continue the course
	private Professor _professorName;	//Professor teaching the course at the school the course is offered at which contains this course
	private int _year;	//The year this course is offered
	private Vector<Students> _studentNames;	//List of the students in the course at the given year
	/* CONSTRUCTORS */
	public Course()
	{
		_name="";
		_minGrade=Grades.A;
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
	/* GETTERS & SETTERS */
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
	/* HELPER METHODS */
	public String ToString()
	{
		String temp="";
		temp += "NAME:" + _name + '\n' + "MIN GRADE:" + _minGrade + '\n' + "PROFESSOR:" + _professorName + '\n' + "YEAR:" + _year + '\n';
		return temp;
	}
}
