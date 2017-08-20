package service;

import entities.*;

public class CourseService 
{
	private Course _course;	//The course the services are performed on/at
	/*
	 * public void getData()
	{
		CourseInput CI=new CourseInput();
	}
	public void setData()
	{
		CourseOutput CO=new CourseOutput();
	}
	*/
	/* CONSTRUCTORS */
	public CourseService()
	{
		_course=null;
	}
	public CourseService(Course course)
	{
		_course=course;
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
	
}
