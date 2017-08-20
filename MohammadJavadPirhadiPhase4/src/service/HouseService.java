package service;

import java.util.Vector;

import entities.*;

public class HouseService 
{
	private House _house;	//The House the services are performed on/at
	private Vector<House> _allHouses; //All the House in the system
	/* CONSTRUCTORS */
	public HouseService()
	{
		_house=null;
		_allHouses=new Vector<House>();
	}
	public HouseService(House house,Vector<House> allHouses)
	{
		_house=house;
		_allHouses=allHouses;
	}
	/* GETTERS & SETTERS */
	public House getHouse()
	{
		return _house;
	}
	public void setHouse(House house)
	{
		_house=house;
	}
	public Vector<House> getAllHouses()
	{
		return _allHouses;
	}
	public void setAllHouses (Vector<House> allHouses)
	{
		_allHouses=allHouses;
	}
}
