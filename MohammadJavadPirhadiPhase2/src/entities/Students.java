package entities;

import java.util.Vector;

public class Students 
{
	private Vector<Course> _courses;
	private Vector<FinishedCourse> _reportCard;
	public Students()
	{
		_courses=new Vector<Course>();
		_reportCard=new Vector<FinishedCourse>();
	}
	public Students(Vector<Course> courses,Vector<FinishedCourse> reportCard)
	{
		_courses=courses;
		_reportCard=reportCard;
	}
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
