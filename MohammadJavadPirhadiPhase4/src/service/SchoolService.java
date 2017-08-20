package service;

import java.util.Vector;

import entities.*;

public class SchoolService 
{
	private School _school;	//The school the services are performed on/at
	public Houses _sortingHat;	//result of sorting hat for use in StudentService class
	private Vector<School> _allSchools; //All the schools in the system
	public Houses sortingHat(boolean bravery, boolean daring, boolean nerve, boolean chivarly, boolean hardWork, boolean dedication, boolean patience, boolean loyalty, boolean fairPlay, boolean intelligence, boolean knowledge, boolean wit, boolean ambition, boolean cunning, boolean recourcefulnesss)
	//an algorithm that will sort students into houses according to each house’s qualities
	{
		if (bravery== true &&daring== true &&nerve== true &&chivarly== true)
		{
			return Houses.Gryffindor;
		}
		if (hardWork== true &&dedication== true &&patience== true &&loyalty== true&& fairPlay==true)
		{
			return Houses.Hufflepuff;
		}
		if (intelligence== true &&knowledge== true &&wit== true)
		{
			return Houses.Ravenclaw;
		}
		if (ambition== true &&cunning== true &&recourcefulnesss== true)
		{
			return Houses.Slytherin;
		}
		return null;
	}
	/* CONSTRUCTORS */
	public SchoolService()
	{
		_school=null;
		_allSchools=new Vector<School>();
	}
	public SchoolService (School school,Vector<School> allSchools)
	{
		_school=school;
		_allSchools=allSchools;
	}
	/* GETTERS & SETTERS */
	public School getSchool()
	{
		return _school;
	}
	public void setSchool(School school)
	{
		_school=school;
	}
	public Vector<School> getAllSchools()
	{
		return _allSchools;
	}
	public void setAllSchools(Vector<School> allSchools)
	{
		_allSchools=allSchools;
	}
}
