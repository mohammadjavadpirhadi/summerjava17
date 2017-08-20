package service;

import java.util.Vector;

import entities.*;

public class CourseService 
{
	private Course _course;	//The course the services are performed on/at
	private Vector<Course> _allCourses; //All the Courses in the system
	/* CONSTRUCTORS */
	public CourseService()
	{
		_course=null;
		_allCourses=new Vector<Course>();
	}
	public CourseService(Course course,Vector<Course> allCourses)
	{
		_course=course;
		_allCourses=allCourses;
	}
	/* GETTERS & SETTERS */
	public Course getCourse()
	{
		return _course;
	}
	public void setCourse(Course course)
	{
		_course=course;
	}
	public Vector<Course> getAllCourses()
	{
		return _allCourses;
	}
	public void setAllCourses (Vector<Course> allCourses)
	{
		_allCourses=allCourses;
	}
}
