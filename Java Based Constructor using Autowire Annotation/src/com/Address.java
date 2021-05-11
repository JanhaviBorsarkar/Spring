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
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + "]";
	}
	
	
}
