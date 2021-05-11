package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int rno;
	private String name;
	@Autowired
	private Address addr;
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", addr=" + addr + "]";
	}

}
