package com;

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
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
