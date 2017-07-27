package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School 
{
	private String _name;
	private int _numOFstudent;
	private boolean _housed;
	private ArrayList<String> _houseNames;
	private ArrayList<String> _courseNames;
	private Vector<String> _studentNames;
	private Vector<String> _professorNames;
	public School(String name)
	{
		_name=name;
		_houseNames=new ArrayList<String>();
		_courseNames=new ArrayList<String>();
		_professorNames=new Vector<String>();
		_studentNames=new Vector<String>();
		_housed=false;
		_numOFstudent=0;
	}
	public School(String name,ArrayList<String> houses,ArrayList<String> courses,Vector<String> students,Vector<String> professors)
	{
		_name=name;
		_houseNames=houses;
		_courseNames=courses;
		_studentNames=students;
		_professorNames=professors;
		if(_studentNames!= null)
			_numOFstudent=(_studentNames.size());
		else
			_numOFstudent=0;
		if(houses==null||houses.isEmpty())
			_housed=false;
		else
			_housed=true;
	}
	public Vector<String> get_perofessorNames() 
	{
		return _professorNames;
	}
	public void set_professorNames(Vector<String> perofessorNames) 
	{
		_professorNames = perofessorNames;
	}
	public String get_name() 
	{
		return _name;
	}
	public void set_name(String name) 
	{
		_name = name;
	}
	public int get_numOFstudent() 
	{
		return _numOFstudent;
	}
	public void set_numOFstudent(int numOFstudent) 
	{
		_numOFstudent = numOFstudent;
	}
	public boolean is_housed() 
	{
		return _housed;
	}
	public void set_housed(boolean housed) 
	{
		_housed = housed;
	}
	public ArrayList<String> get_houseNames() 
	{
		return _houseNames;
	}
	public void set_houseNames(ArrayList<String> houseNames) 
	{
		_houseNames = houseNames;
	}
	public ArrayList<String> get_courseNames() 
	{
		return _courseNames;
	}
	public void set_courseNames(ArrayList<String> courseNames) 
	{
		_courseNames = courseNames;
	}
	public Vector<String> get_studentNames() 
	{
		return _studentNames;
	}
	public void set_studentNames(Vector<String> studentNames) 
	{
		_studentNames = studentNames;
	}
}