package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School 
{
	private String _name;	//The school’s name
	private int _numOFstudent;	//Number of students attending the school
	private boolean _housed;	//A house may or may not have houses
	private ArrayList<House> _houseNames;	//If a school doesn’t have any houses, this vector will be null
	private ArrayList<Course> _courseNames;	// This vector contains the information of courses offered
	private Vector<Students> _studentNames;	//This vector contains the information of students attending
	private Vector<Professor> _professorNames;	// This vector contains the information of courses offered
	private String _location;	//This string specifies which country the school is located at
	/* CONSTRUCTORS */
	public School(String name)
	{
		_name=name;
		_houseNames=new ArrayList<House>();
		_courseNames=new ArrayList<Course>();
		_professorNames=new Vector<Professor>();
		_studentNames=new Vector<Students>();
		_housed=false;
		_numOFstudent=0;
		_location="";
	}
	public School(String name,ArrayList<House> houses,ArrayList<Course> courses,Vector<Students> students,Vector<Professor> professors,String location)
	{
		_name=name;
		_houseNames=houses;
		_courseNames=courses;
		_studentNames=students;
		_professorNames=professors;
		_location=location;
		if(_studentNames!= null)
			_numOFstudent=(_studentNames.size());
		else
			_numOFstudent=0;
		if(houses==null||houses.isEmpty())
			_housed=false;
		else
			_housed=true;
	}
	/* GETTERS & SETTERS */
	public Vector<Professor> getPerofessorNames() 
	{
		return _professorNames;
	}
	public void setProfessorNames(Vector<Professor> perofessorNames) 
	{
		_professorNames = perofessorNames;
	}
	public String getName() 
	{
		return _name;
	}
	public void setName(String name) 
	{
		_name = name;
	}
	public int getNumOFstudent() 
	{
		return _numOFstudent;
	}
	public void setNumOFstudent(int numOFstudent) 
	{
		_numOFstudent = numOFstudent;
	}
	public boolean isHoused() 
	{
		return _housed;
	}
	public void setHoused(boolean housed) 
	{
		_housed = housed;
	}
	public ArrayList<House> getHouseNames() 
	{
		return _houseNames;
	}
	public void setHouseNames(ArrayList<House> houseNames) 
	{
		_houseNames = houseNames;
	}
	public ArrayList<Course> getCourseNames() 
	{
		return _courseNames;
	}
	public void setCourseNames(ArrayList<Course> courseNames) 
	{
		_courseNames = courseNames;
	}
	public Vector<Students> getStudentNames() 
	{
		return _studentNames;
	}
	public void setStudentNames(Vector<Students> studentNames) 
	{
		_studentNames = studentNames;
	}
	public String getLocation ()
	{
		return _location;
	}
	public void setLocation(String location)
	{
		_location=location;
	}
}