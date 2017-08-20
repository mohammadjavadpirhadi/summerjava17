package service;

import java.util.Vector;

import entities.*;

public class StudentService 
{
	private Students _student;	//The student the services are performed on/at
	private Vector<Students> _allStudents; //All the students in the system
	/* CONSTRUCTORS */
	public StudentService()
	{
		_student=null;
		_allStudents=new Vector<Students>();
	}
	public StudentService (Students student,Vector<Students> allStudents)
	{
		_student=student;
		_allStudents=allStudents;
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
	public Vector<Students> getAllStudents()
	{
		return _allStudents;
	}
	public void setAllStudents(Vector<Students> allStudents)
	{
		_allStudents=allStudents;
	}
}
