package service;

import java.util.Vector;

import entities.*;

public class PersonService 
{
	private Person _person;	//The Person the services are performed on/at
	private Vector<Person> _allPersons; //All the Person in the system
	/* CONSTRUCTORS */
	public PersonService()
	{
		_person=null;
		_allPersons=new Vector<Person>();
	}
	public PersonService(Person person,Vector<Person> allPersons)
	{
		_person=person;
		_allPersons=allPersons;
	}
	/* GETTERS & SETTERS */
	public Person getPerson()
	{
		return _person;
	}
	public void setPerson(Person person)
	{
		_person=person;
	}
	public Vector<Person> getAllPersons()
	{
		return _allPersons;
	}
	public void setAllPersons (Vector<Person> allPersons)
	{
		_allPersons=allPersons;
	}
}
