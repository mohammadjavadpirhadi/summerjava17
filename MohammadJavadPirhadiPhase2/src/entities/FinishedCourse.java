package entities;

public class FinishedCourse extends Course
{
	private Grades _grade;
	private Boolean _passed;
	public FinishedCourse(String name) 
	{
		super(name);
		_grade = Grades.O;
		_passed=false;
	}
	public FinishedCourse(String name, Professor professor, Grades minGrade, int year,Grades grade,Boolean passed) 
	{
		super(name, professor, minGrade, year);
		_grade=grade;
		if(_grade == Grades.O ||_grade == Grades.E ||_grade == Grades.A )
		{
			_passed=true;
		}
		else
		{
			_passed=false;
		}
	}
	public Grades getGrade()
	{
		return _grade;
	}
	public void setGrade(Grades grade)
	{
		_grade=grade;
	}
	public Boolean getPassed()
	{
		return _passed;
	}
	public void setPassed(Boolean passed)
	{
		_passed=passed;
	}
}
