package service;

import entities.*;

public class StudentService 
{
	private Students _student;	//The student the services are performed on/at
	/* CONSTRUCTORS */
	public StudentService()
	{
		_student=null;
	}
	public StudentService (Students student)
	{
		_student=student;
	}
	/* GETTERS & SETTERS */
	public Students getStudent()
	{
		return _student;
	}
	public void setStudent(Students student)
	{
		_student=student;
	}
	public void sortToHouse()
	{
		return ;
	}
}
