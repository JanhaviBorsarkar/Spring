package com.secondary;

public class Student 
{
	private int rno;
	private String name;
	private Address addr;
	
	public Student(int rno, String name, Address addr) {
		super();
		this.rno = rno;
		this.name = name;
		this.addr = addr;
	}
	
	public String toString()
	{
		return "Roll number: " +rno+ "\n Name: " +name+ "\n Address" +addr;
	}
}
