package entities;

import java.util.Date;

public class Person 
{
	public String _name;
	public String _houseName;
	public String _bloodStatus;
	public String _school;
	public Date _birthday;
	public Person(String name)
	{
		_name=name;
		_houseName="";
		_bloodStatus="";
		_school="";
	}
	public Person(String name,String house,String blood,String school,Date birthday)
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
	public String getHouseName ()
	{
		return _houseName;
	}
	public void setHouseName(String house)
	{
		_houseName=house;
	}
	public String getBloodStatus ()
	{
		return _bloodStatus;
	}
	public void setBloodStatus(String blood)
	{
		_bloodStatus=blood;
	}
	public String getSchool ()
	{
		return _school;
	}
	public void setSchool(String school)
	{
		_school=school;
	}
	public Date getBirthday ()
	{
		return _birthday;
	}
	public void setName(Date birthday)
	{
		_birthday=birthday;
	}
}
