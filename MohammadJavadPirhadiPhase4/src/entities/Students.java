package entities;

import java.util.Vector;

public class Students extends Person
{
	private Vector<Course> _courses;	//The courses the student has taken
	private Vector<FinishedCourse> _reportCard;	//The student’s report card
	/* CONSTRUCTORS */
	public Students() 
	{
		super();
		_courses=new Vector<Course>();
		_reportCard=new Vector<FinishedCourse>();
	}
	public Students(String name, House house, BloodStatus blood, School school, String birthday,Vector<Course> courses,Vector<FinishedCourse> reportCard) 
	{
		super(name, house, blood, school, birthday);
		_courses=courses;
		_reportCard=reportCard;
	}
	/* GETTERS & SETTERS */
	public Vector<Course> getCourses()
	{
		return _courses;
	}
	public void setCourses (Vector<Course> courses)
	{
		_courses=courses;
	}
	public Vector<FinishedCourse> getReportCard()
	{
		return _reportCard;
	}
	public void setReportCared (Vector<FinishedCourse> reportCard)
	{
		_reportCard=reportCard;
	}
}
