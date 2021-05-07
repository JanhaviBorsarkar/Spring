package com.primitive;

public class Student 
{
	private int rno;
	private String name;
	
	public Student(int rno, String name) 
	{
		super();
		this.rno = rno;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Roll number: " +rno);
		System.out.println("Name: " +name);
	}
	
	
}
