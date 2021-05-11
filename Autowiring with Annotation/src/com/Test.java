package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("bean.xml");
		Student s = (Student) ap.getBean("stu");
		
		System.out.println("Roll number: " +s.getRno());
		System.out.println("Name: " +s.getName());
		System.out.println("Area: " +s.getAddr().getArea());
		System.out.println("City: " +s.getAddr().getCity());
	}

}
