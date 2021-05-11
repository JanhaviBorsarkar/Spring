package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student 
{
	private List slist;
	private Map smap;
	private Set sset;
	
	public Student(List slist, Map smap, Set sset) 
	{
		super();
		this.slist = slist;
		this.smap = smap;
		this.sset = sset;
	}

	public String toString()
	{
		return "List: " +slist+ "\nMap: " +smap+ "\nSet: " +sset;
	}
}
