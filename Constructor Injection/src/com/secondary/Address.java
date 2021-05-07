package com.secondary;

public class Address 
{
	private String area;
	private String city;
	
	public Address(String area, String city) 
	{
		super();
		this.area = area;
		this.city = city;
	}
	
	public String toString()
	{
		return "Area: " +area+ "\n City: " +city;
	}
	
}
