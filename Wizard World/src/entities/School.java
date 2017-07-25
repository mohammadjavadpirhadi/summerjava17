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
	private Vector<String> _perofessorNames;
	public School(String name)
	{
		set_name(name);
		set_houseNames(new ArrayList<String>());
		set_courseNames(new ArrayList<String>());
		set_studentNames(new Vector<String>());
		set_perofessorNames(new Vector<String>());
		set_numOFstudent(0);
		set_housed(false);
	}
	public School(String name,ArrayList<String> houses,ArrayList<String> courses,Vector<String> students,Vector<String> perofessors)
	{
		set_name(name);
		set_houseNames(houses);
		set_courseNames(courses);
		set_studentNames(students);
		set_perofessorNames(perofessors);
		if(get_studentNames()!= null)
			set_numOFstudent(get_studentNames().size());
		else
			set_numOFstudent(0);
		if(houses==null||houses.isEmpty())
			set_housed(false);
		else
			set_housed(true);
	}
	public Vector<String> get_perofessorNames() 
	{
		return _perofessorNames;
	}
	public void set_perofessorNames(Vector<String> _perofessorNames) 
	{
		this._perofessorNames = _perofessorNames;
	}
	public String get_name() 
	{
		return _name;
	}
	public void set_name(String _name) 
	{
		this._name = _name;
	}
	public int get_numOFstudent() 
	{
		return _numOFstudent;
	}
	public void set_numOFstudent(int _numOFstudent) 
	{
		this._numOFstudent = _numOFstudent;
	}
	public boolean is_housed() 
	{
		return _housed;
	}
	public void set_housed(boolean _housed) 
	{
		this._housed = _housed;
	}
	public ArrayList<String> get_houseNames() 
	{
		return _houseNames;
	}
	public void set_houseNames(ArrayList<String> _houseNames) 
	{
		this._houseNames = _houseNames;
	}
	public ArrayList<String> get_courseNames() 
	{
		return _courseNames;
	}
	public void set_courseNames(ArrayList<String> _courseNames) 
	{
		this._courseNames = _courseNames;
	}
	public Vector<String> get_studentNames() 
	{
		return _studentNames;
	}
	public void set_studentNames(Vector<String> _studentNames) 
	{
		this._studentNames = _studentNames;
	}
}