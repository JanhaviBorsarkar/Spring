package com;

public class Address 
{
	private String area;
	private String city;
	public Address(String area, String city) {
		super();
		this.area = area;
		this.city = city;
	}
	
	public String toString()
	{
		return "Address: \nArea: " +area+ "\nCity: " +city;
	}
}
