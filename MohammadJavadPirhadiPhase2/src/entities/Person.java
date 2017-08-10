package entities;

public class Person 
{
	public String _name;
	public House _houseName;
	public BloodStatus _bloodStatus;
	public School _school;
	public String _birthday;
	public Person(String name)
	{
		_name=name;
		_houseName=null;
		_bloodStatus=null;
		_school=null;
	}
	public Person(String name,House house,BloodStatus blood,School school,String birthday)
	{
		_name=name;
		_houseName=house;
		_bloodStatus=blood;
		_school=school;
		_birthday=birthday;
	}
	public String getName ()
	{
		return _name;
	}
	public void setName(String name)
	{
		_name=name;
	}
	public House getHouseName ()
	{
		return _houseName;
	}
	public void setHouseName(House house)
	{
		_houseName=house;
	}
	public BloodStatus getBloodStatus ()
	{
		return _bloodStatus;
	}
	public void setBloodStatus(BloodStatus blood)
	{
		_bloodStatus=blood;
	}
	public School getSchool ()
	{
		return _school;
	}
	public void setSchool(School school)
	{
		_school=school;
	}
	public String getBirthday ()
	{
		return _birthday;
	}
	public void setBirthday(String birthday)
	{
		_birthday=birthday;
	}
}
