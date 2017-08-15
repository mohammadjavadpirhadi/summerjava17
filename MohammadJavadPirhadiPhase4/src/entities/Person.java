package entities;

public class Person 
{
	private String _name;	//Person’s name
	private House _houseName;	//If a person does not belong in a house, the value is “N/A”
	private BloodStatus _bloodStatus;	//Blood status of the person
	private School _school;	//the school this person is/did attend or teach
	private String _birthday;	//A string that is to be checked that represents a date
	/* CONSTRUCTORS */
	public Person(String name)
	{
		_name=name;
		_houseName=null;
		_bloodStatus=BloodStatus.Pure_Blood;
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
	/* GETTERS & SETTERS */
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
