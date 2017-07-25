package entities;

import java.util.ArrayList;
import java.util.Vector;

public class Students 
{
	private String _name;
	private int _numOFstudent;
	private boolean _housed;
	private ArrayList<String> _houseNames;
	private ArrayList<String> _courseNames;
	private Vector<String> _studentNames;
	private Vector<String> _perofessorNames;
	public Students(String name)
	{
		_name=name;
		_houseNames=new ArrayList<String>();
		_courseNames=new ArrayList<String>();
		_studentNames=new Vector<String>();
		_perofessorNames=new Vector<String>();
		_numOFstudent=0;
		_housed=false;
	}
	public void School(String name,boolean housed,ArrayList<String> houses,ArrayList<String> courses,Vector<String> students,Vector<String> perofessors)
	{
		_name=name;
		_houseNames=houses;
		_courseNames=courses;
		_studentNames=students;
		_perofessorNames=perofessors;
		if(_studentNames!= null)
			_numOFstudent=_studentNames.size();
		else
			_numOFstudent=0;
		if(houses==null||houses.isEmpty())
			_housed=false;
		else
			_housed=true;
	}
}