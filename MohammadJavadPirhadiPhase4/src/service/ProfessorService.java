package service;

import java.util.Vector;

import entities.*;

public class ProfessorService 
{
	private Professor _professor;	//The Professor the services are performed on/at
	private Vector<Professor> _allProfessors; //All the Professor in the system
	/* CONSTRUCTORS */
	public ProfessorService()
	{
		_professor=null;
		_allProfessors=new Vector<Professor>();
	}
	public ProfessorService(Professor professor,Vector<Professor> allProfessors)
	{
		_professor=professor;
		_allProfessors=allProfessors;
	}
	/* GETTERS & SETTERS */
	public Professor getProfessor()
	{
		return _professor;
	}
	public void setProfessor(Professor professor)
	{
		_professor=professor;
	}
	public Vector<Professor> getAllProfessors()
	{
		return _allProfessors;
	}
	public void setAllProfessors (Vector<Professor> allProfessors)
	{
		_allProfessors=allProfessors;
	}
}
