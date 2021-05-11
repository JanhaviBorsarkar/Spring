package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private int rno;
	private String name;
	@Autowired
	private Address addr;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
